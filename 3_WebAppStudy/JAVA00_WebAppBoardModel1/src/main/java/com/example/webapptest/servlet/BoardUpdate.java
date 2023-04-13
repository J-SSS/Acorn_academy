package com.example.webapptest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/model1/boardUpdate.do")
public class BoardUpdate extends HttpServlet {
        String url="jdbc:mysql://localhost:3306/webappboard";
        String user ="boardServerDev";
        String pw ="mysql123";
        String driver = "com.mysql.cj.jdbc.Driver"; //j
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");

        String param = req.getParameter("b_id");

        String html ="<h2>" +param +"번 게시글 수정하기</h2>";

        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver); //동적로딩에 사용할 클래스 불러오기
            conn = DriverManager.getConnection(url,user,pw);
            String sql = "SELECT * FROM boards where b_id="+param;
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            html +="<form method='post' action='./boardUpdate.do'>";
            while (rs.next()) {
                html+="<p> b_id :"+rs.getInt("b_id")+"</p>";
                html+="<p> u_id :"+rs.getString("u_id")+"</p>";
                html+="<p> post_time :"+rs.getString("post_time")+"</p>";
                html+="<p> update_time :"+rs.getString("update_time")+"</p>";
                html+="<p> status : "+rs.getString("status")+"";
                html+=" <select name='status'><option>PUBLIC</option><option>PRIVATE</option><option>REPORT</option><option>BLOCK</option></select></p>";
                html+="<p><label>title : <input name='title' value='"+rs.getString("title")+"'><label> </p>";
                html+="<p> content :<textarea name='content'>"+rs.getString("content")+"</textarea></p>";
                html+="<p> view_count :"+rs.getString("view_count")+"</p>";
                html+="<p><a href='./boardDelete.do?b_id="+rs.getInt("b_id")+"'>삭제</a></p>";
                html+="<p><button type='reset'>초기화</button> <button>수정</button> </p>";
                html+="<input type='hidden' name='b_id' value='"+rs.getInt("b_id")+"'>";
            }
            html += "</form>";


        } catch (Exception e) {

        }
        resp.getWriter().println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        String status = req.getParameter("status");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String bId_Str = req.getParameter("b_id");
        String sql = "UPDATE boards SET status=?,title=?, content=? WHERE b_id=?";

        Connection conn = null;
        PreparedStatement psmt = null;
        int update=0;
        try{
            int bId=Integer.parseInt(bId_Str);
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pw);
            psmt = conn.prepareStatement(sql);
            psmt.setString(1,status);
            psmt.setString(2,title);
            psmt.setString(3,content);
            psmt.setInt(4,bId);
            update =psmt.executeUpdate();
        } catch (Exception e) {

        }
        //수정 성공시 detail, 실패시 updateForm
        if(update>0){
            resp.sendRedirect(req.getContextPath()+"/model1/boardDetail.do?b_id="+bId_Str);
        } else{
            resp.sendRedirect(req.getContextPath()+"/model1/boardUpdate.do?b_id="+bId_Str);
        }

    }
}

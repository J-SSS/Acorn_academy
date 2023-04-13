package com.acorn.webappboard.servlet;

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
public class Model1BoardUpdate extends HttpServlet {
    String url="jdbc:mysql://localhost:3306/webAppBoard";
    String user="boardServerDev";
    String pw="mysql123";
    String driver="com.mysql.cj.jdbc.Driver";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        String html="<h1>게시글 수정 폼</h1>";
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        String bId_str=req.getParameter("b_id");
        try {
            int bId=Integer.parseInt(bId_str);
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,pw);
            String sql="SELECT * FROM boards WHERE b_id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,bId);
            rs=pstmt.executeQuery();
            html+="<form method='POST' action='./boardUpdate.do'>";
            if(rs.next()){
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
            html+="</form>";
        }catch (NumberFormatException e){
            e.printStackTrace();
            resp.sendError(400,"잘못된 요청입니다.");
        } catch (Exception e){
            e.printStackTrace();
        }
        resp.getWriter().println(html);
    }
    //405 해당 동적페이지의 요청 메소드가 잘못됨
    //등록 폼 등록 액션 구현해서 BoardInsert.java 제출~
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String status=req.getParameter("status");
        String title=req.getParameter("title");
        String content=req.getParameter("content");
        String bId_str=req.getParameter("b_id");
        String sql="UPDATE boards SET status=?,title=?,content=? WHERE b_id=?";
        Connection conn=null;
        PreparedStatement pstmt=null;
        int update=0;
        try {
            int bId=Integer.parseInt(bId_str);
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,pw);
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,status);
            pstmt.setString(2,title);
            pstmt.setString(3,content);
            pstmt.setInt(4,bId);
            update=pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        //수정 성공시 detail 실패 updateForm
        if(update>0){
            resp.sendRedirect(req.getContextPath()+"/model1/boardDetail.do?b_id="+bId_str);
        }else{
            resp.sendRedirect(req.getContextPath()+"/model1/boardUpdate.do?b_id="+bId_str);
        }
    }
}

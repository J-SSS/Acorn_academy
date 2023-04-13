package com.example.webapptest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/model1/boardInsert.do")
public class BoardInsert extends HttpServlet {
    String url="jdbc:mysql://localhost:3306/webappboard";
    String user ="boardServerDev";
    String pw ="mysql123";
    String driver = "com.mysql.cj.jdbc.Driver";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        String html ="<h2>게시글 등록</h2>";
        html+="<p><a href='./boardList.do'>뒤로가기</a></p>";
        html+= "<form action='./boardInsert.do' method='post' style=`width: 600px;`>";
        html+= "<p><label> 아이디 : <input type='' name='u_id' value=''></label></p>";
        html+= "<p><label> 제목 : <input type='' name='title' value=''></label></p>";
        html+= "<p><label> 내용 : <textarea name='content' value=''></textarea></label></p>";
        html+=" <p><label> 등급 : " +
                    "<select name='status'>" +
                        "<option>PUBLIC</option>" +
                        "<option>PRIVATE</option>" +
                        "<option>REPORT</option>" +
                        "<option>BLOCK</option>" +
                    "</select></label></p>";
        html+="<p><button type='reset'>초기화</button> <button>제출</button> </p>";
        html+= "</form>";

        resp.getWriter().println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String u_id = req.getParameter("u_id");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String status = req.getParameter("status");

        String sql = "insert into boards(u_id,title,content,status) value (?,?,?,?)";

        Connection conn = null;
        PreparedStatement psmt = null;

        int insert=0;
        try{

            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pw);
            psmt = conn.prepareStatement(sql);
            psmt.setString(1,u_id);
            psmt.setString(2,title);
            psmt.setString(3,content);
            psmt.setString(4,status);

            insert = psmt.executeUpdate();
            System.out.println(insert);

        } catch (Exception e) {

        }

        if(insert>0){
            resp.sendRedirect(req.getContextPath()+"/model1/boardList.do");
        } else{
            resp.sendRedirect(req.getContextPath()+"/model1/boardInsert.do");
        }
    }
}

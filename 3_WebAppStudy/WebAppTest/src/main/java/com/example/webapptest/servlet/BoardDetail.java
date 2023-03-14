package com.example.webapptest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/model1/boardDetail.do")
public class BoardDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String param = req.getParameter("b_id");

        String url="jdbc:mysql://localhost:3306/webappboard";
        String user ="boardServerDev";
        String pw ="mysql123";
        String driver = "com.mysql.cj.jdbc.Driver"; //j

        String html ="<h2>" +param +"번 게시글 상세보기</h2>";

        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver); //동적로딩에 사용할 클래스 불러오기
            conn = DriverManager.getConnection(url,user,pw);
            String sql = "SELECT * FROM boards where b_id="+param;
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();


            while (rs.next()) {
                html +="<ol>";
                html +="<li> 글 번호 : "+ rs.getInt("b_id")+"</li>";
                html +="<li> 아이디 : "+ rs.getString("u_id")+"</li>";
                html +="<li> 작성시간 : "+ rs.getString("post_time")+"</li>";
                html +="<li> 수정시간 : "+ rs.getString("update_time")+"</li>";
                html +="<li> 상 태 : "+ rs.getString("status")+"</li>";
                html +="<li> 제 목 : "+ rs.getString("title")+"</li>";
                html +="<li> 내 용 : "+ rs.getString("content")+"</li>";
                html +="<li> 조회수 : "+ rs.getString("view_count")+"</li>";
                html += "<li><a href='./boardUpdate.do?b_id=" + rs.getString("b_id") + "'>수정</a></li>";

            }
            System.out.println(rs.toString());;
        } catch (Exception e) {
        }
        resp.getWriter().println(html);
    }
}

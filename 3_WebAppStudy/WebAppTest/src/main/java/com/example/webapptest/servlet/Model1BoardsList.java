package com.example.webapptest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//클라이언트에서 요청이 오면  톰캣에서 web.xml 설정에 있는 동적파일(HttpServlet)을 실행해서 결과를 반영함
@WebServlet("/model1/boardList.do") //컴파일시 web.xml 설정에 있는 동적리소스의 주소를 등록
public class Model1BoardsList extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url="jdbc:mysql://localhost:/webappboard";
        String user ="boardServerDev";
        String pw ="mysql123";
        String driver = "com.mysql.cj.jdbc.Driver"; //jdbc가 db 접속할 때 필요한 주소

        resp.setContentType("text/html;charset=utf-8");
        String html ="<h1>model1+jdbc 게시글 리스트!</h1>";
        html += "<p>model1 : Model, Controller, View가 한 페이지에 있는 것</p>";
        html += "<p>JDBC : 자바 어플(톰캣의 웹 앱)에서 db접속하는 것 (모듈과 패키지 java.sql.*)</p>";
        resp.getWriter().println(html);
    }
}

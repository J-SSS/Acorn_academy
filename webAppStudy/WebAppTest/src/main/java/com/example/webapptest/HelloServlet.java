package com.example.webapptest;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
//@WebServlet 컴파일시 자동으로 web.xml에 해당 서블릿을 배포하도록 설정한다.

public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "!23213" + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
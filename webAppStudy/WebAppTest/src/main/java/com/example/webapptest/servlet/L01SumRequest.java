package com.example.webapptest.servlet;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//자바 파일이 동적리소스가 되려면 httpServlet 타입이어야한다.
//톰캣이 동적리소스를 실행할 때 HttpServlet 객체만 실행가능
//해당 서블릿을 DD에 등록해야 동적리소스로 배포가능함.
public class L01SumRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //해당 동적 페이지를 브라우저에서 url로 호출하면 doGet이 실행된다.
        //실행의 결과는 매개변수인 resp로 작성하면 문서로 반환된다.
        //~~Reader 문자열을 입력하는 객체, ~~Writer 문자열을 출력하는 객체
        //request : 요청에 대한 정보를 담는 객체 url, 파라미터, client 정보

        String paramA = req.getParameter("a");
        String paramB = req.getParameter("b");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
//        out.append("<h1>안녕!!</h1>");
        out.append("a+b"+(Double.parseDouble(paramA)+(Double.parseDouble(paramA))));
        out.append("<p>파라미터 a와 b에 의해서 출력된 결과가 바뀌는 동적 페이지입니다.</p>");
    }
}

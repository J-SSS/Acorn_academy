package com.acorn.webappboard.controller;

import com.acorn.webappboard.dto.UsersDto;
import com.acorn.webappboard.service.UsersService;
import com.acorn.webappboard.service.UsersServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/users/login.do")
public class UsersLoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //JSP는 pug처럼 html을 렌더링하는 템플릿 엔진...
        //문법은 자바인데 인터프리트언어로 취급...
        /*
        인터프리트(js,python,rubby) <-> 컴파일(java,c,c++)
        인터프리트 언어는 컴파일 없이 문자열 그대로 실행된다는 특징...
         */
        req.getRequestDispatcher("/templates/users/login.jsp").forward(req, resp);
        /*
        express의 fug는 라우터가 뷰를 렌더링하고 끝..(이런 방식이 요즘 대세임.. 템플릿엔진에 req,res를 안보낸다!)
        톰켓으 jsp는 뷰를 렌더링 하면서 요청과 응답을 jsp에서 마무리지음
        정보는 숨겨져야하는데.. jsp는 인터프리트언어로서 정적리소스 페이지와 동일한 위치에 존재한다...!!
        => 클라이언트는 정적리소스위치에 파일을 업로드 하거나 다운로드 할 수 있기때문에 보안에 취약하다...!

        jsp가 요청과 응답을 들고가면 서버에 대한 주요한 정보가 노출될 수 있다.
        혹은 악의적은 jsp파일을 제작해서 서버에 업로드한 뒤 실행시키면 db에 접속하여 정보를 빼내거나, 서버를 다운시키는 공격이 가능하다..
         */
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String uId = req.getParameter("u_id");
        String uPw = req.getParameter("pw");
        UsersDto loginUser=null;
        try {
            UsersService usersService = new UsersServiceImp();
            loginUser = usersService.login(uId, uPw);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        resp.getWriter().println(loginUser);
        /*
        http 통신에서 Session이란?? : 인증 같은 서비스를 위해 서버에 저장하는 객체 (쿠키로 클라이언트 아이디[JSESSIONID]와 만료시간(30분)을 지정)
        요청이 들어온 클라이언트와 대응되는 sesstion이 있다면 요청정보에 담아준다.. 대응되는 session이 없다면 만들어서 담음
         */
        HttpSession session = req.getSession(); //session의 타입은 Map과 같다...
        session.setAttribute("loginUser", loginUser);

        resp.sendRedirect(req.getContextPath()); // 톰캣은 index.jsp를 root경로로 지정해놓았다~
    }
}

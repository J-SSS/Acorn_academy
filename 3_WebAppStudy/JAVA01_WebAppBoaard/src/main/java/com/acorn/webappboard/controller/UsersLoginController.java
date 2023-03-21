package com.acorn.webappboard.controller;

import com.acorn.webappboard.dto.UsersDto;
import com.acorn.webappboard.lib.AESEncryption;
import com.acorn.webappboard.service.UsersService;
import com.acorn.webappboard.service.UsersServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/users/login.do")
public class UsersLoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //인터프린트(js,python,ruby) <-> 컴파일(java,c,c++.....)
        //jsp 퍼그 처럼 html을 렌더링하는 템플릿 엔진 (문법은 자바인데 인터프린트언어로 취급)
        //html : xhtml (html4)
        //<button>  <-> <button/>
        req.getRequestDispatcher("/templates/users/login.jsp").forward(req,resp);
        //express fug 는 라우터가 뷰를 렌더링하고 끝 (대세!!)
        //톰캣 jsp 는 뷰를 렌더링하면서 요청과 응답을 jsp 페이지에서 마무리한다. (옛날 방식!! 보안에 취약)

        //jsp 는 인터린트 언어로 정적리소스 페이지와 동일한 위치에 존재한다.
        //클라이언트는 정적리소스 페이지 위치에 파일을 업로드하거나 다운로드 할수 있다.(보안에 취약)
        //jsp는 요청과 응답을 처리할 수 있는 동적페이지로 서버에 대한 주요 정보가 존재할 수 있다.
        //해커 jsp 페이지를 서버에 업로드하고 호출하면서 실행!! (db에 접속해서 중요한 정보를 취득 가능)
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String uId=req.getParameter("u_id");
        String pw=req.getParameter("pw");
        String autoLogin=req.getParameter("autoLogin");
        String modalMsg = "";
        String errMsg = null;
        UsersDto loginUser=null;

        try {
            UsersService usersService=new UsersServiceImp();
            loginUser=usersService.login(uId,pw);
        } catch (Exception e) {
            e.getMessage();
            errMsg=e.getMessage();
        }
        //resp.getWriter().println(loginUser);
        //http Session : 인증같은 서비스를 위해 서버에 저장하는 객체 (쿠키로 클라이언트 아이디[JSESSIONID]와 만료시간(30분)을 지정)
        //요청이 들어온 클라이언트와 대응되는 session 이 있다면 요청정보에 담아준다.(없으면 새로 만들어 담아준다.)
        HttpSession session=req.getSession(); //session 의 타입은 Map 과 동일
        if(loginUser!=null){
            if(autoLogin!=null && autoLogin.equals("1")){ //자동로그인용 쿠키 생성
                //쿠키로 자동로그인 구현(login.do, logout.do를 제외한 요청에서 id와 pw 쿠키가 있으면 자동으로 로그인 시도함..
                try {
                    //u_id : user-1 => %!#!@#@!!@%
                    //pw : 1234 => !%@#^#@$@dDASqwe
                    String encryptedId= AESEncryption.encryptValue(loginUser.getUId());
                    String encryptedPw= AESEncryption.encryptValue(loginUser.getPw());

                    //쿠키 및 쿠키 지속시간 설정

                    Cookie idCookie=new Cookie("AUTOLOGIN_UID",encryptedId);
                    Cookie pwCookie=new Cookie("AUTOLOGIN_PW",encryptedPw);
                    idCookie.setMaxAge(7*24*60*60);
                    pwCookie.setMaxAge(7*24*60*60);

                    //쿠키의 유효 url naver.com/users/login.do라고 해버리면 /users/에서만 작동하니까... "/"로 해줘야뎀
                    idCookie.setPath(req.getContextPath());
                    pwCookie.setPath(req.getContextPath());

                    //쿠키는 클라이언트가 저장하는 정보라서 응답으로 보낸다...
                    resp.addCookie(idCookie);
                    resp.addCookie(pwCookie);

                    modalMsg="자동";

                } catch (Exception e) {
                    session.setAttribute("actionMsg","일주일간 자동 로그인 실패 "+e.getMessage());
                    e.printStackTrace();
                }
            }
            modalMsg+="로그인 성공";
            session.setAttribute("actionMsg",modalMsg);
            session.setAttribute("loginUser",loginUser);
            resp.sendRedirect(req.getContextPath()); // index.jsp 를 root 경로로 지정해 놓았다
        }else {
            if(errMsg!=null){
                modalMsg = "db오류 다시 시도 " + errMsg;
            } else {
                modalMsg = "아이디나 비밀번호를 확인하세요!";
            }

            session.setAttribute("actionMsg","아이디와 패스워드를 확인하세요!");
            resp.sendRedirect(req.getContextPath()+"/users/login.do");
        }
    }
}

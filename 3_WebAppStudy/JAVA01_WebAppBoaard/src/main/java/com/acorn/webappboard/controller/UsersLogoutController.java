package com.acorn.webappboard.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet("/users/logout.do")
public class UsersLogoutController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        //cookie 에서 LOGIN_ID 와 LOGIN_PW 를 찾아서 만료시키세요~
        Cookie [] cookies=req.getCookies();
        Cookie loginId=null;
        Cookie loginPw=null;
        for(Cookie c : cookies){
            switch (c.getName()){
                case "AUTOLOGIN_ID": loginId=c; break;
                case "AUTOLOGIN_PW": loginPw=c; break;
            }
        }
//        System.out.println(loginId.getValue()+"/"+loginPw.getValue());
        if(loginId!=null){
            loginId.setMaxAge(0);
            loginId.setPath(req.getContextPath());
            resp.addCookie(loginId);
        }
        if(loginPw!=null) {
            loginPw.setMaxAge(0);
            loginPw.setPath(req.getContextPath());
            resp.addCookie(loginPw);
        }
        session.removeAttribute("loginUser");
        resp.sendRedirect(req.getContextPath()+"/"); //sendRedirect 되면서 쿠키가 브라우저에 넘어가지 않음
    }
}

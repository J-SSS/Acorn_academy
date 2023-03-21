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
        //session.invalidate();//유효시간을 0으로한다. =>세션 삭제!

        Cookie[] cookies=req.getCookies();

        for(Cookie c: cookies ){ //LOGIN_ID, LOGIN_PW
            c.setMaxAge(7*24*60*60);
            c.setPath(req.getContextPath()+"/model1");
            resp.addCookie(c);
        }

        session.removeAttribute("loginUser");
        resp.sendRedirect(req.getContextPath()+"/");
    }
}

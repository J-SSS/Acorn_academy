package com.acorn.webappboard.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/users/logout.do")
public class UsersLogoutController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.invalidate(); // 유효시간을 0으로 한다... => 세션 삭제가 됨!
        session.removeAttribute("loginUser"); //세션 객체에 있는 로그인 유저만 삭제~

        resp.sendRedirect(req.getContextPath() + "/");
    }
}

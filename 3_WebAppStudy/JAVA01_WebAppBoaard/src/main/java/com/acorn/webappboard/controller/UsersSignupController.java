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

@WebServlet("/users/signup.do")
public class UsersSignupController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/templates/users/signup.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        UsersDto user=new UsersDto(); //파라미터로 넘어온 user 정보를 db에 저장할 때 사용
        String uId=req.getParameter("u_id");
        String name=req.getParameter("name");
        String pw=req.getParameter("pw");
        String phone=req.getParameter("phone");
        String email=req.getParameter("email");
        String gender=req.getParameter("gender");
        String address=req.getParameter("address");
        String detailAddress=req.getParameter("detail_address");
        String birth=req.getParameter("birth");
        user.setUId(uId);
        user.setName(name);
        user.setPw(pw);
        user.setPhone(phone);
        user.setEmail(email);
        user.setGender(gender);
        user.setAddress(address);
        user.setDetailAddress(detailAddress);
        user.setBirth(birth);
        String errorMsg="";
        HttpSession session=req.getSession();
        int insert=0;
        try {
            UsersService usersService=new UsersServiceImp();
            insert=usersService.register(user);
        }catch (Exception e){
            e.printStackTrace();
            errorMsg=e.getMessage();
        }
        if(insert>0){
            session.setAttribute("actionMsg","회원가입 축하합니다. 로그인 하세요~!");
            resp.sendRedirect(req.getContextPath()+"/");
        }else{
            session.setAttribute("actionMsg","등록 실패 :"+errorMsg);
            resp.sendRedirect(req.getContextPath()+"/users/signup.do");
        }
    }
}

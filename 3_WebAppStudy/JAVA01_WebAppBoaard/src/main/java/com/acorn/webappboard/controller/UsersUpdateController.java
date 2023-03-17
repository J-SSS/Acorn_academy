package com.acorn.webappboard.controller;

import com.acorn.webappboard.dto.UsersDto;
import com.acorn.webappboard.service.UsersService;
import com.acorn.webappboard.service.UsersServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/update.do")
public class UsersUpdateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uId = req.getParameter("u_id");
        if(uId==null){
            resp.sendError(400,"잘못된 요청입니다..!!");
            return;
        }
        UsersDto user = null;
        try {
            UsersService usersService = new UsersServiceImp();
            user = usersService.detail(uId);
        } catch (Exception e) {
            resp.sendError(500,"DB 처리 오류");
        }
//        resp.getWriter().println(user);
        req.setAttribute("user",user); //렌더링 할 jsp user(Object)를 전달 함
        req.getRequestDispatcher("/templates/users/update.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        req.setCharacterEncoding("UTF-8");
        UsersDto user =new UsersDto(); //파라미터로 넘어온 user정보를 db에 저장할 때 사용
        String uId = req.getParameter("u_id");
        String name = req.getParameter("name");
        String pw = req.getParameter("pw");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String birth = req.getParameter("birth");
        String gender = req.getParameter("gender");
        String address = req.getParameter("address");
        String detailaddress = req.getParameter("detail_address");
        user.setUId(uId);
        user.setName(name);
        user.setPw(pw);
        user.setPhone(phone);
        user.setBirth(birth);
        user.setGender(gender);
        user.setEmail(email);
        user.setAddress(address);
        user.setDetailAddress(detailaddress);

        int update = 0;
        try {
            UsersService usersService = new UsersServiceImp();
            update = usersService.modify(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(update>0){
            resp.sendRedirect(req.getContextPath()+"/users/detail.do?u_id="+uId);
        }else{
            resp.sendRedirect(req.getContextPath()+"/users/update.do?u_id="+uId);
        }
        //과제
        //user 회원가입 + ajax(u_idCheck 구현)
        //board crud (search+paging)

        req.setCharacterEncoding("UTF-8");
//        resp.getWriter().println(user);


    }
}

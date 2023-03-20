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

@WebServlet("/users/detail.do")
public class UsersDetailController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uId=req.getParameter("u_id");
        if(uId==null){
            resp.sendError(400,"잘못된 요청입니다.");
            return;
        }
        UsersDto user=null;
        try {
            UsersService usersService=new UsersServiceImp();
            user=usersService.detail(uId);
        }catch (Exception e){
            //resp.sendError(500,"db 처리 오류!");
            e.printStackTrace();
        }
        req.setAttribute("user",user); //렌더링할 jsp user(Object) 를 전달
        req.getRequestDispatcher("/templates/users/detail.jsp").forward(req,resp);
    }
}

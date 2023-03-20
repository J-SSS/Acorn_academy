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

@WebServlet("/users/idCheck.do")
public class UsersIdCheckController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uId=req.getParameter("u_id");
        if(uId==null){
            resp.sendError(400);
            return;
        }
        UsersDto user=null;
        try {
            UsersService usersService=new UsersServiceImp();
            user=usersService.detail(uId);
            System.out.println(user);
        }catch (Exception e){
            resp.sendError(500);
        }
        resp.setContentType("application/json;charset=UTF-8");
        resp.getWriter().println("{ \"checkId\" : "+(user!=null)+" }");
    }
}

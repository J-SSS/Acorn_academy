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

@WebServlet("/users/delete.do")
public class UsersDeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uId=req.getParameter("u_id");
        UsersDto user=null;
        try {
            user=new UsersServiceImp().detail(uId);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(user!=null){
            req.setAttribute("user",user);
            req.getRequestDispatcher("/templates/users/delete.jsp").forward(req,resp);
        }else{
            req.getSession().setAttribute("actionMsg","존재하지 않는 레코드는 탈퇴할 수 없습니다.");
            resp.sendRedirect(req.getContextPath());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uId=req.getParameter("u_id");
        String pw=req.getParameter("pw");
        int delete=0;
        String errorMsg=null;
        String modalMsg="회원탈퇴 성공";
        String redirectPage=req.getContextPath(); //index
        HttpSession session=req.getSession();
        try {
            UsersService usersService=new UsersServiceImp();
            delete=usersService.dropOut(uId,pw);

        }catch (Exception e){
            e.getMessage();
            errorMsg=e.getMessage();
        }
        if(delete==0){ //오류가 뜨거나, 해당레코드가 없거나, 비밀번호를 틀려도 0
            modalMsg="탈퇴 실패 비밀번호를 확인하세요! :(에러) "+errorMsg;
            redirectPage+="/users/delete.do?u_id="+uId;
        }else{
            //session.invalidate(); //세션을 만료시키면 actionMsg 을 포함할 수 없다.
            session.removeAttribute("loginUser");//탈퇴했으니 로그아웃
        }
        session.setAttribute("actionMsg",modalMsg);
        resp.sendRedirect(redirectPage);
    }
}

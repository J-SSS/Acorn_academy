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
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/users/update.do")
public class UsersUpdateController extends HttpServlet {
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
            e.printStackTrace();
        }
        req.setAttribute("user",user);
        req.getRequestDispatcher("/templates/users/update.jsp").forward(req,resp);
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
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        //Date birthDate=sdf.parse(birth);
        user.setBirth(birth);
        user.setUId(uId);
        user.setName(name);
        user.setPw(pw);
        user.setPhone(phone);
        user.setEmail(email);
        user.setGender(gender);
        user.setAddress(address);
        user.setDetailAddress(detailAddress);
        int update=0;
        String errorMsg = null;
        String modalMsg="";
        String redirectPage = "";
        try {
            UsersService usersService=new UsersServiceImp();
            update=usersService.modify(user);
        }catch (Exception e){
            e.printStackTrace(); //콘솔 빨간 로그 + 리소스의 위치 포함
            errorMsg = e.getMessage();
        }
        if(update>0){
            modalMsg = "수정 성공";
            redirectPage = (req.getContextPath()+"/users/detail.do?u_id="+uId);

        }else{
            modalMsg = "수정 실패 :";
            if(errorMsg!=null){
                modalMsg += errorMsg;
                redirectPage = (req.getContextPath()+"/users/update.do?u_id="+uId);
            } else { // 해당 레코드를 수정하려는데 이미 삭제된 경우
                modalMsg += "해당 레코드가 없습니다.";
                redirectPage = (req.getContextPath()+"/");
            }


        }
        req.getSession().setAttribute("actionMsg",modalMsg);
        resp.sendRedirect(redirectPage);
    }
    //과제!
    //user 회원가입! + ajax (u_idCheck 구현)
    //board crud (search+paging)
}

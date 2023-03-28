package com.acorn.webappboard.controller;

import com.acorn.webappboard.dto.UsersDto;
import com.acorn.webappboard.service.UsersService;
import com.acorn.webappboard.service.UsersServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
@WebServlet("/users/signup.do")
@MultipartConfig// multipart/form-data 에서 blob으로 오는 파라미터를 처리
public class UsersSignupController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/templates/users/signup.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //이미지는 보통 웨앱에 저장하지 않는다. (strema 서버나, 서버컴퓨터의 특정경로에 저장(o))
        String path = ("c:/Users/dongr/Desktop/Acorn_academy/3_WebAppStudy/JAVA01_WebAppBoaard/src/main/webapp/public/img/users");

        System.out.println("path = " + path);
        String uId=req.getParameter("u_id");
        String name=req.getParameter("name");
        String pw=req.getParameter("pw");
        String phone=req.getParameter("phone");
        String email=req.getParameter("email");
        String birth=req.getParameter("birth");
        String gender=req.getParameter("gender");
        String address=req.getParameter("address");
        String detailAddress=req.getParameter("detail_address");
        System.out.println("??");
        String imgPath=null;
        try {
            String imgName=uId+"_"+System.currentTimeMillis()+".jpeg";
            Part profileImg=req.getPart("img_path");
            profileImg.write(path+"/"+imgName);
            imgPath="/public/img/users/"+imgName;
            System.out.println(profileImg.getSubmittedFileName());
            System.out.println("??");
        }catch (Exception e){
            e.printStackTrace();
        }
        UsersDto user=new UsersDto();
        user.setUId(uId);
        user.setPw(pw);
        user.setBirth(birth);
        user.setAddress(address);
        user.setEmail(email);
        user.setGender(gender);
        user.setName(name);
        user.setPhone(phone);
        user.setDetailAddress(detailAddress);
        user.setImgPath(imgPath);
        int insert=0;
        String modalMsg="";
        String erroMsg=null;
        String redirectPage="";
        HttpSession session=req.getSession();
        try {
            UsersService usersService=new UsersServiceImp();
            insert=usersService.register(user);
        }catch (Exception e){
            e.printStackTrace();
            erroMsg=e.getMessage();
        }

        if(insert>0){
            modalMsg="회원가입 축하합니다. 로그인하세요!";
            redirectPage=req.getContextPath()+"/";
        }else{
            modalMsg="회원가입 실패 에러: "+erroMsg;
            redirectPage=req.getContextPath()+"/users/signup.do";
        }
        session.setAttribute("actionMsg",modalMsg);
        resp.sendRedirect(redirectPage);
    }
}

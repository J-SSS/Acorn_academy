package com.acorn.webappboard.filter;

import com.acorn.webappboard.dto.UsersDto;
import com.acorn.webappboard.lib.AESEncryption;
import com.acorn.webappboard.service.UsersServiceImp;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("*")
public class AutoLoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("AutoLoginFilter.doFilter");
        HttpServletRequest req=(HttpServletRequest)request;
        HttpServletResponse res=(HttpServletResponse) response;
        HttpSession session=req.getSession();
        //로그인폼, 로그인액션, 로그아웃 액션 페이지는 자동로그인 제외
        if(req.getRequestURI().endsWith("/users/login.do") || req.getRequestURI().endsWith("/users/logout.do") ){
            chain.doFilter(request,response);
            return;
        }

        //클라이언트 요청에 자동로그인 쿠키가 포함되어 있으면 자동로그인하는 필터

        Cookie[]cookies=req.getCookies();
        Cookie autoLoginId=null;
        Cookie autoLoginPw=null;
        for(Cookie c: cookies ){
            if(c.getName().equals("AUTOLOGIN_UID")){
                autoLoginId=c;
            } else if (c.getName().equals("AUTOLOGIN_PW")) {
                autoLoginPw=c;
            }
        }
        if(autoLoginId!=null && autoLoginPw!=null){
            try {
                //복호화 ...  !@#!!@#23ads => u_id, pw로...
                String uId= AESEncryption.decryptValue(autoLoginId.getValue());
                String pw= AESEncryption.decryptValue(autoLoginPw.getValue());
                System.out.println("uId = " + uId);
                System.out.println("pw = " + pw);
                UsersDto loginUser= new UsersServiceImp().login(uId,pw);
                if (loginUser!=null  ){
                    System.out.println(req.getRequestURI());
//                    && req.getRequestURI()!="/WebAppBoard/users/logout.do"
                    session.setAttribute("loginUser",loginUser);
                }else{
                    session.setAttribute("actionMsg","자동로그인 아이디나 비밀번호를 확인하세요.");
                    autoLoginId.setMaxAge(0);
                    autoLoginPw.setMaxAge(0);
                    res.addCookie(autoLoginId);
                    res.addCookie(autoLoginPw);
                    res.sendRedirect(req.getContextPath()+"/users/login.do");
                    return;
                }
            }catch (Exception e){
                e.printStackTrace();
                session.setAttribute("actionMsg","자동로그인 실패 :"+e.getMessage());
            }
        }
        chain.doFilter(req,res);
    }
}

package com.acorn.webappboard.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/model1/boardDelete.do")
public class Model1BoardDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bId_str=req.getParameter("b_id");

        String url="jdbc:mysql://localhost:3306/webAppBoard";
        String user="boardServerDev";
        String pw="mysql123";
        String driver="com.mysql.cj.jdbc.Driver";
        Connection conn=null;
        PreparedStatement pstmt=null;
        //delete,insert,update 쿼리는(dml)는 결과가 정수로 반환
        int delete=0;
        try {
            int bId=Integer.parseInt(bId_str);
            String sql="DELETE FROM boards WHERE b_id=?";
            Class.forName(driver);
            conn= DriverManager.getConnection(url,user,pw);
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,bId);
            delete=pstmt.executeUpdate();//dml 실행
        }catch (NumberFormatException e){
            e.printStackTrace();
            resp.sendError(400,"잘못된 요청입니다.");
        }catch (Exception e){
            e.printStackTrace();
        }


        //http://localhost:8080/WebAppBoard/model1/boardList.do
        // "/model1/boardList.do" => http://localhost:8080/model1/boardList.do
        String contextPath=req.getContextPath(); // == /WebAppBoard
        if(delete>0){
            resp.sendRedirect(contextPath+"/model1/boardList.do");
        }else{
            resp.sendRedirect(contextPath+"/model1/boardUpdate.do?b_id="+bId_str);
        }
    }
}

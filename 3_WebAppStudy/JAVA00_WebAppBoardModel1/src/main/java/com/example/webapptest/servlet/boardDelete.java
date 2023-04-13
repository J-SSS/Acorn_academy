package com.example.webapptest.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/model1/boardDelete.do")
public class boardDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String bId_str = req.getParameter("bId");
        String url="jdbc:mysql://localhost:3306/webappboard";
        String user ="boardServerDev";
        String pw ="mysql123";
        String driver = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        //delete, insert, update dml은 결과가 정수로 반환됨
        int delete=0;
        try {
            int bId = Integer.parseInt(bId_str);
            String sql = "DELETE FROM boards WHERE b_id=?";
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pw);
            psmt=conn.prepareStatement(sql);
            psmt.setInt(1,bId);
            delete=psmt.executeUpdate();

        } catch (NumberFormatException e){
            e.printStackTrace();
            resp.sendError(400,"잘못된 요청입니다..");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//        String msg=(delete>0)?"성공":"실패";
//        resp.getWriter().println("삭제"+msg);
        String contextPath = req.getContextPath(); // ~~/webappboard


        if(delete>0){

            resp.sendRedirect(contextPath + "/model1/boardList.do");
        } else {
            resp.sendRedirect(contextPath + "/model1/boardUpdate.do?b_id="+bId_str);
        }
    }
}

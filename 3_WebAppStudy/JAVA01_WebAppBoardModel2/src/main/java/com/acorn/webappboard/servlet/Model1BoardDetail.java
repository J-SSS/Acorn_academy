package com.acorn.webappboard.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
@WebServlet("/model1/boardDetail.do")
public class Model1BoardDetail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String url="jdbc:mysql://localhost:3306/webAppBoard";
        String user="boardServerDev";
        String pw="mysql123";
        String driver="com.mysql.cj.jdbc.Driver";
        resp.setContentType("text/html;charset=UTF-8");
        String html="<h1>게시글 상세</h1>";

        Connection conn=null; //접속
        PreparedStatement pstmt=null; //Statement : 쿼리실행, PreparedStatement ?에 파라미터 주입
        ResultSet rs=null; //table 의 자료구조

        String bId_str=req.getParameter("b_id");
        //req.getQueryString() //?b+id=6&...
        try {
            int bId=Integer.parseInt(bId_str); //NumberFormatException
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,pw);
            String sql="SELECT * FROM boards WHERE b_id=?";
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,bId);
            rs=pstmt.executeQuery();
            if(rs.next()){
                html+="<p> b_id :"+rs.getInt("b_id")+"</p>";
                html+="<p> u_id :"+rs.getString("u_id")+"</p>";
                html+="<p> post_time :"+rs.getString("post_time")+"</p>";
                html+="<p> update_time :"+rs.getString("update_time")+"</p>";
                html+="<p> status :"+rs.getString("status")+"</p>";
                html+="<p> title :"+rs.getString("title")+"</p>";
                html+="<p> content :"+rs.getString("content")+"</p>";
                html+="<p> view_count :"+rs.getString("view_count")+"</p>";
                html+="<p><a href='./boardUpdate.do?b_id="+rs.getInt("b_id")+"'>수정 폼(==detail)</a></p>";
            }
        }catch (NumberFormatException e){//파라미터를 정수로 변경할 수 없다는 것은 없거나 잘못된 값이 온 것
            e.printStackTrace();
            resp.sendError(400,"잘못된 요청입니다.");
        } catch (Exception e){
            e.printStackTrace();
        }
        resp.getWriter().println(html);



    }
}

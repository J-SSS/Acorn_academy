package com.acorn.javascriptstudy;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/deptListJson.do")
public class l20 extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json;charset=UTF-8;");
        PrintWriter out = response.getWriter();

        String url = "jdbc:mysql://localhost:3306/SCOTT";
        String user = "root";
        String pw = "mysql123";
        String driver = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM DEPT";



        List<DeptDto> deptList = null;
        DeptDto dept = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pw);
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            deptList = new ArrayList<>();
            while (rs.next()) {
                dept= new DeptDto();
                dept.setDeptno(rs.getInt("deptno"));
                dept.setDname(rs.getString("dname"));
                dept.setLoc(rs.getString("loc"));
                deptList.add(dept);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        String deptJson="[";
        if(deptList!=null){
            for (int i=0; i<deptList.size(); i++){

                DeptDto dept2=deptList.get(i);
                deptJson+="{";
                deptJson+="\"deptno\":"+dept2.getDeptno()+",";
                deptJson+="\"dname\":\""+dept2.getDname()+"\",";
                deptJson+="\"loc\":\""+dept2.getLoc()+"\"";
                deptJson+="}";
                deptJson+=(i!=deptList.size()-1)?",":"";
            }
        }
        deptJson+="]";
        out.println(deptJson);
    }
}


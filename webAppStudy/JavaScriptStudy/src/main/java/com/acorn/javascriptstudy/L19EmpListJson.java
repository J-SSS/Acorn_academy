package com.acorn.javascriptstudy;

import com.mysql.cj.xdevapi.JsonArray;
import com.mysql.cj.xdevapi.JsonParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.cert.TrustAnchor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/empListJson.do")
public class L19EmpListJson extends HelloServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 동적 페이지는 서버에서 한 번 실행하는 문서
        // 동적 페이지는 호출할 때 마다 내용(db)가 갱신될 수 있다.
        // 동적 페이지는 호출할 때 내용을 바꿀 수 있는 파라미터(쿼리스트링)를 전달 받을 수 있어야한다.
        // url?queryString (?key=value&key=value&....)
//        String a = request.getParameter("a");
//        String b = request.getParameter("b");
        response.setContentType("application/json;charset=UTF-8;");
        PrintWriter out = response.getWriter();
//        out.println("<h1>안녕!</h1>");
//        out.println("{\"name\":\"경민\"}");
//        out.println("{\"sum\":"+(a+b)+"}");


        String url = "jdbc:mysql://localhost:3306/SCOTT";
        String user = "root";
        String pw = "mysql123";
        String driver = "com.mysql.cj.jdbc.Driver";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        //queryString의 요청정보가 request에 존재하고, 파라미터는 무조건 문자열이다
        String para = request.getParameter("deptno");

//        if (para!=null){
//            sql += " Where deptno =" + para;
//        }


        List<EmpDto> empList = null;
        EmpDto emp = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pw);
            try{
                String sql = "SELECT * FROM EMP WHere DEPTNO = ?";
                pstmt = conn.prepareStatement(sql);
                int deptno = Integer.parseInt(para);
                pstmt.setInt(1, deptno);
            }
            catch (Exception e){
                e.printStackTrace();
                pstmt = conn.prepareStatement("SELECT * FROM EMP");
            }

            rs = pstmt.executeQuery();
            empList = new ArrayList<>();
            while (rs.next()) {
                emp = new EmpDto();
                emp.setEmpno(rs.getInt("empno"));
                emp.setEname(rs.getString("ename"));
                emp.setJob(rs.getString("job"));
                emp.setSal(rs.getDouble("sal"));
                emp.setDeptno(rs.getInt("deptno"));
                empList.add(emp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        out.println(empList);

        String empJson="[";
        if(empList!=null){
            for (int i=0; i<empList.size(); i++){

                EmpDto emp2=empList.get(i);
                empJson+="{";
                empJson+="\"empno\":"+emp2.getEmpno()+",";
                empJson+="\"ename\":\""+emp2.getEname()+"\",";
                empJson+="\"job\":\""+emp2.getJob()+"\",";
                empJson+="\"sal\":"+emp2.getSal()+",";
                empJson+="\"depno\":"+emp2.getDeptno()+"";
                empJson+="}";
                empJson+=(i!=empList.size()-1)?",":"";
            }
        }
        empJson+="]";
        out.println(empJson);
        //"[{"empno":7788,"ename":"scott.....]"
    }
}

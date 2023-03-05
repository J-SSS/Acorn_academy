package com.acorn.javascriptstudy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// 톰캣에서 동적 페이지(서블릿)를 생성하기 위한 2가지 약속!!
// 서블릿으로 정의할 타입을 HttpServlet으로 정의
// 서블릿을 리소스로 등록하기 위해 DD(web.xml)에 주소로 등록
@WebServlet("/l14_emp_list.do")
public class L14EmpList extends HttpServlet {
    //클라이언트에서 리소스를 요청하는 2가지 방식(GET : url, Post : 양식제출)
    //doGet은 클라이언트가 l14_emp_list.do를 url로 호출하면
    // 톰캣이 해당 리소스의 doGet()함수를 실행


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        //java.sql.* //JDBC java에서 제공하는 db접속 객체들..
        // jdbc가 mysql에 접속하기 위해서는 mysql-j-connector가 필요하다

        String user="root";
        String pw="mysql123";
        String Driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/scott";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String empListStr="";
        List<EmpDto> empList = null;


        resp.setContentType("text/html;charset=UTF-8");
        //해당 문자열을 리소스로 반환하면 브라우저가 자동으로 문서의 형식을 찾음
        //java는 문서가 바뀌면 class로 컴파일하고 톰캣에 배포된 webapp을 바꿔야한다.. 배포필수

        PrintWriter out = resp.getWriter(); //resp.getWriter() : 리소스로 반환될 문자열 작성
        out.println("<h1>Scott.emp list 출력<h1>");
//        out.println(empList);

        out.println("<h2>문제1 : 부서번호를 파라미터로 보내면 쿼리로 부서번호에 해당하는 사원만 출력하세요</h2>");
        out.println("<h2>문제2 : dept와 emp를 조인해서 부서이름과 상사이름을 출력하세요</h2>");
        out.println("<h2><a href='./l14_dept_list.do'>문제2 : 부서리스트를 출력하는 동적페이지를 만드세요</a></h2>");
        out.println("<hr>");


        out.println("찾을 부서번호 : <form name='input' method='get' action=''>\n" +
                "    <input type='text' name='memberNo' maxlength='10'>\n" +
                "    <input type='submit' value='전송'>\n" +
                "</form>");

      String[] test = req.getParameterValues("memberNo");


        try { //try catch 오류가 발생해도 시스템이 멈추지 않게 하는 예외처리
            Class.forName(Driver); //동적로딩의 대상
            //동적로딩 : 특정 객체가 작업을 수행할 때 객체를 생성하는 행위(제어의 역전)
            //드라이버매니저가 db에 접속할 때 주소를 보고 필요한 라이브러리를 찾아서 생성후 접속함(동적로딩)

            conn =DriverManager.getConnection(url,user,pw);
            pstmt = conn.prepareStatement("SELECT * FROM EMP e LEFT JOIN dept d on d.DEPTNO = e.DEPTNO WHERE e.DEPTNO="+test[0] );
            rs=pstmt.executeQuery(); //질의어를 실행하는 함수

            empList = new ArrayList<EmpDto>();

            while (rs.next()){
                /*
                // 문자열로 db의 데이터를 받으면 제어할 방법이 없다. 그래서 DTO를 정의해서 사용한다...
                empListStr+=rs.getInt("empno");
                empListStr+=rs.getString("ename");
                empListStr+=rs.getString("job");
                 */

                EmpDto emp = new EmpDto();
                emp.setEmpno(rs.getInt("empno"));
                emp.setEname(rs.getString("ename"));
                emp.setJob(rs.getString("job"));
                emp.setSal(rs.getDouble("sal"));
                emp.setComm(rs.getDouble("comm"));
                emp.setMgr(rs.getString("mgr"));
                emp.setDeptno(rs.getInt("deptno"));
                emp.setHiredate(rs.getDate("hiredate"));
                emp.dname=rs.getString("dname");
                empList.add(emp);

            }

        }
        catch (Exception e){ //부모타입의 예외를 작성할수록 더 많은 예외처리를 할 수 있음
            e.printStackTrace();
        }




        empListStr+="<table>";
        empListStr+="<tr><th>사번</th><th>이름</th><th>부서번호</th><th>부서이름</th><th>상사이름</th></tr>";
        for(EmpDto emp : empList){
            empListStr+="<tr>";
            empListStr+="<td>"+emp.getEmpno()+"</td>";
            empListStr+="<td>"+emp.getEname()+"</td>";
            empListStr+="<td>"+emp.getDeptno()+"</td>";
            empListStr+="<td>"+emp.dname+"</td>";

            empListStr+="</tr>";


        }
        empListStr+="</table>";
        out.println(empListStr);
    }
}

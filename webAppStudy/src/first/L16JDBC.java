package first;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Collection;
//mysql에서 제공하는 접속패키지.


// jDBC lib
// java.sql은 jdk에 포함되어있으며, 접속한 db에서 sql문을 실행하기 위한 함수들을 제공함
import java.sql.*;

public class L16JDBC {
    public static void main(String[] args) {

        // JDBC : Java Data Base Connect : 자바로 db서버에 접속하는 것(java.sql.* 객체를 제공)
        // JDBC로 db서버에 접속하려면 해당 db에서 제공하는 커넥터 객체를 사용해야함
        //
        String url = "jdbc:mysql://localhost:3306/SCOTT";
        String user = "root";
        String pw = "mysql123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pw);
            System.out.println(conn);
            // DriverManager : jdbc의 db접속에 관여하는 객체로, 접속시 connection 객체를 반환하며 접속유지함
            // 동적로딩 : DriverManager가 mysql에 접속 할 때 mysql에서 제공하는 Driver를 객체로 생성해서 사용하는데
            // 이를 동적로딩이라고 함.

            /*
            Connection conn = DriverManager.getConnection(url,user,pw, new Driver());
            일반적인 객체지향의 형식은 위와 같으나, Driver객체를 밖으로 빼서
            필요할 때 만들어서 사용하도록 함.
             */

           Statement stmt = conn.createStatement(); // 쿼리를 실행하는 객체. statement를 반환
           ResultSet rs = stmt.executeQuery("SELECT * FROM emp WHERE deptno = 10");
           // executeQuery 질의어(select,DQL:data question lang)를 실행하는 함수
           // ResultSet : table의 자료구조로 만듦. (Iterator로 출력확인 가능 next)

            while (rs.next()) { //오버라이딩되어 next와 hasnext의 기능을 동시에 함
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int sal = rs.getInt("sal");

                System.out.println(empno + "::" + ename  + "::" + job  + "::" + sal); // <-- 요놈을 html로 출력하면 그게 웹서버가 되는거임
            }



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

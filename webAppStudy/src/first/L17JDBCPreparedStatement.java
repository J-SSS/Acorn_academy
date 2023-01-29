package first;


import java.sql.*;

public class L17JDBCPreparedStatement {
    public static void main(String[] args) {
        //PreparedStatement : sql injection 해킹을 방어하기 위해 등장

        String mysqlDriver = "com.mysql.cj.jdbc.Driver"; //DriverManager가 동적로딩할때 사용됨
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String pw = "mysql123";

        try {
            Class.forName(mysqlDriver); //동적 로딩을 하기 위한 준비

            /*
            Connection conn = null; // 접속하면 반환되는 객체
            PreparedStatement pstm = null; // 쿼리를 실행하는 객체
            ResultSet rs = null; // 질의어를 실행하면 반환되는 table
            */
            String sql = "select * from emp where DEPTNO=20 OR 1=1; DROP TABLE EMP";
            // 검색창에서 20수를 입력받아서 서비스를 제공하는것이 목표인데
            // 해커가 where DEPTNO=20 OR 1=1; DROP TABLE EMP; 식으로 입력하면 1=1은 항상 true니까 emp 테이블을 삭제시킬수있음
            // 이걸 sql injection이라고 함.
            // 이런식의 해킹은 parameter의 타입 검사만 하면 막을 수 있다.
            // where DEPTNO='20 OR 1=1; DROP TABLE EMP' 같은 방법으로...

            String sql2 = "select * from emp where DEPTNO=? AND JOB=?";

            Connection conn = DriverManager.getConnection(url,user,pw);
            PreparedStatement pstm = conn.prepareStatement(sql2);
            pstm.setInt(1,20);
            pstm.setString(2, "clerk");
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                int empno = rs.getInt(1); // 테이블의 칼럼을 정의할 때의 순서대로 반환
                String ename = rs.getString(2);
                String job = rs.getString(3);
                int mgr = rs.getInt(4);
                System.out.println(empno + "\t::\t" + ename + "\t::\t" + job + "\t::\t" + mgr);
            }



            System.out.println(conn);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

package com.example.webapptest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WebAppBoardConn {
    private static Connection conn = null;
    private static final String USER="boardServerDev";
    private static final String PW ="mysql123";
    private static final String URL ="jdbc:mysql://localhost:3306/WebAppBoard";
    private static final String DRIVER="com.mysql.cj.jdbc.Driver";

    public static Connection getConn() throws ClassNotFoundException, SQLException {
        if(conn==null || conn.isClosed()){
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USER,PW);
        }
        return conn;
    } //디자인패턴 : 싱글톤패턴(객체를 한 번만 만들어 사용하기 위한 디자인 패턴)
}

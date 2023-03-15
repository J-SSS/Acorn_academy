package com.example.webapptest.dao;



import com.example.webapptest.dto.UsersDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersDaoImp implements UsersDao{
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public UsersDaoImp(Connection conn) {
        this.conn = conn;
    }

    @Override
    public UsersDto findByUIdAndPw(String uId, String pw) throws Exception {
        UsersDto user=null;
        String sql="SELECT * FROM users WHERE u_id=? AND pw=?";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,uId);
        pstmt.setString(2,pw);
        rs=pstmt.executeQuery();
        if(rs.next()){
           user=parseUserDto(rs);
        }
        return user;
    }

    @Override
    public UsersDto findByUId(String uId) throws Exception {
        UsersDto user = null;
        String sql ="SELECT * FROM users WHERE u_id=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,uId);
        rs=pstmt.executeQuery();
        if(rs.next()){
            user=parseUserDto(rs);
        }

        return user;
    }

    @Override
    public int updateByPk(UsersDto user) throws Exception {
        String sql="UPDATE users set name=?,email=?,img_path=?,phone=?,pw=?,gender=?,adress=?,detail_address=? WHERE u_id=?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,user.getName());
        pstmt.setString(2,user.getEmail());
        pstmt.setString(3,user.getName());
        pstmt.setString(4,user.getName());
        pstmt.setString(5,user.getName());
        pstmt.setString(6,user.getName());
        pstmt.setString(7,user.getName());
        return 0;
    }

    @Override
    public int save(UsersDto user) throws Exception {
        return 0;
    }

    @Override
    public int updatePermissionByUIdAndPw(UsersDto user) throws Exception {
        return 0;
    }

    @Override
    public int deleteByUIdAngPw(String uId, String pw) throws Exception {
        return 0;
    }

    public UsersDto parseUserDto(ResultSet rs) throws SQLException {

            UsersDto user=new UsersDto();
            user.setUId(rs.getString("U_id"));
            user.setPw(rs.getString("pw"));
            user.setAddress(rs.getString("address"));
            user.setDetailAddress(rs.getString("detail_address"));
            user.setEmail(rs.getString("email"));
            user.setPhone(rs.getString("phone"));
            user.setGender(rs.getString("gender"));
            user.setPermission(rs.getString("permission"));
            user.setBirth(rs.getString("birth"));
            user.setName(rs.getString("name"));
            user.setImgPath(rs.getString("img_path"));
            user.setPostTime(rs.getDate("post_time"));
        return user;
    }
}

package com.acorn.webappboard.dao;

import com.acorn.webappboard.dto.UsersDto;

import java.sql.*;

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
        UsersDto user=null;
        String sql="SELECT * FROM users WHERE u_id=?";
        pstmt= conn.prepareStatement(sql);
        pstmt.setString(1,uId);
        rs=pstmt.executeQuery();
        if(rs.next()){
            user=parseUserDto(rs);
        }
        return user;
    }

    @Override
    public int updateByPk(UsersDto user) throws Exception {
        int update=0;
        String sql="UPDATE users set name=?,email=?,img_path=?,phone=?,pw=?,gender=?,address=?,detail_address=? WHERE u_id=?";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,user.getName());
        pstmt.setString(2,user.getEmail());
        pstmt.setString(3,user.getImgPath());
        pstmt.setString(4,user.getPhone());
        pstmt.setString(5,user.getPw());
        pstmt.setString(6,user.getGender());
        pstmt.setString(7,user.getAddress());
        pstmt.setString(8,user.getDetailAddress());
        pstmt.setString(9,user.getUId());
        update=pstmt.executeUpdate();
        return update;
    }

    @Override
    public int save(UsersDto user) throws Exception {
        int save=0;
        String sql="INSERT INTO users (u_id, pw, name, phone, img_path, email, birth, gender, address, detail_address) VALUE (?,?,?,?,?,?,?,?,?,?)";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,user.getUId());
        pstmt.setString(2,user.getPw());
        pstmt.setString(3,user.getName());
        pstmt.setString(4,user.getPhone());
        pstmt.setString(5,user.getImgPath());
        pstmt.setString(6,user.getEmail());
        pstmt.setString(7,user.getBirth());
        pstmt.setString(8,user.getGender());
        pstmt.setString(9,user.getAddress());
        pstmt.setString(10,user.getDetailAddress());
        save=pstmt.executeUpdate();
        return save;
    }

    @Override
    public int updatePermissionByUIdAndPw(UsersDto user) throws Exception {
        int update=0;
        String sql="UPDATE users SET permission=? WHERE u_id=? AND pw=?";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,user.getPermission());
        pstmt.setString(2,user.getUId());
        pstmt.setString(3,user.getPw());
        update=pstmt.executeUpdate(); //dml, executeQuery dql
        return update;
    }

    @Override
    public int deleteByUIdAndPw(String uId, String pw) throws Exception {
        int delete=0;
        String sql="DELETE FROM users WHERE u_id=? AND pw=?";
        pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,uId);
        pstmt.setString(2,pw);
        delete=pstmt.executeUpdate();
        return delete;
    }
    public UsersDto parseUserDto(ResultSet rs) throws SQLException {
        UsersDto user=new UsersDto();
        user.setUId(rs.getString("u_id"));
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

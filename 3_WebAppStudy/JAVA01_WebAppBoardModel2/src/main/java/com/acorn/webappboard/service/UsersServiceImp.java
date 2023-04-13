package com.acorn.webappboard.service;

import com.acorn.webappboard.WebAppBoardConn;
import com.acorn.webappboard.dao.UsersDao;
import com.acorn.webappboard.dao.UsersDaoImp;
import com.acorn.webappboard.dto.UsersDto;

import java.sql.Connection;
import java.sql.SQLException;

public class UsersServiceImp implements UsersService{
    private Connection conn;
    private UsersDao usersDao;

    public UsersServiceImp() throws Exception {
        conn= WebAppBoardConn.getConn();
        this.usersDao = new UsersDaoImp(conn);
    }

    @Override
    public UsersDto login(String uId, String pw) throws Exception {
        return usersDao.findByUIdAndPw(uId,pw);
    }

    @Override
    public UsersDto detail(String uId) throws Exception {
        return usersDao.findByUId(uId);
    }

    @Override
    public UsersDto idCheck(String uId) throws Exception {
        return usersDao.findByUId(uId);
    }

    @Override
    public int modify(UsersDto user) throws Exception {
        int modify=0;
        modify=usersDao.updateByPk(user);
        return modify;
    }
    @Override
    public int register(UsersDto user) throws Exception {
        return usersDao.save(user);
    }
    @Override
    public int closeAccount(UsersDto user) throws Exception {
        return usersDao.updatePermissionByUIdAndPw(user);
    }
    @Override
    public int dropOut(String uId, String pw) throws Exception {
        return usersDao.deleteByUIdAndPw(uId,pw);
    }
}

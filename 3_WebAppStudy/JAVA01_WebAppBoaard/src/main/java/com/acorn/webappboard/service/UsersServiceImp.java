package com.acorn.webappboard.service;

import com.acorn.webappboard.WebAppBoardConn;
import com.acorn.webappboard.dao.UsersDao;
import com.acorn.webappboard.dao.UsersDaoImp;
import com.acorn.webappboard.dto.UsersDto;

import java.sql.Connection;

public class UsersServiceImp implements UsersService{
    private UsersDao usersDao;
    private Connection conn;

    public UsersServiceImp() throws Exception {
        conn = WebAppBoardConn.getConn();
        this.usersDao = new UsersDaoImp(conn);
    }

    //트랜젝션 : 친구에게 계좌 송금(서비스) -> 내 계좌 업데이트, 기록 업데이트(실패),/// 친구계좌 업데이트(dao)
    //  실패시 롤백 필요함...

    @Override
    public UsersDto login(String uId, String pw) throws Exception {
        return usersDao.findByUIdAndPw(uId, pw);
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
        int modify = 0;
//        conn.commit(); //롤백지점
//        try{
//            modify = usersDao.updateByPk(user);
//            /*
//            ...
//            ..
//            ..실패
//             */
//        } catch (Exception e) {
//            conn.rollback();
//        }
        return usersDao.updateByPk(user);
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
        return usersDao.deleteByUIdAndPw(uId, pw);
    }
}

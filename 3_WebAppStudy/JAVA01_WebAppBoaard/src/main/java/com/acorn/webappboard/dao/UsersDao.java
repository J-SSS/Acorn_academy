package com.acorn.webappboard.dao;

import com.acorn.webappboard.dto.UsersDto;

public interface UsersDao {
    UsersDto findByUIdAndPw(String uId,String pw) throws Exception;
    UsersDto findByUId(String uId) throws Exception;
    int updateByPk(UsersDto user) throws Exception;
    int save(UsersDto user) throws Exception;
    int updatePermissionByUIdAndPw(UsersDto user) throws Exception;
    int deleteByUIdAndPw(String uId,String pw) throws Exception;
}

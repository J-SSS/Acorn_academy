package com.example.webapptest.dao;


import com.example.webapptest.dto.UsersDto;

public interface UsersDao  {
    UsersDto findByUIdAndPw(String uId, String pw) throws Exception;
    UsersDto findByUId(String uId) throws Exception;
    int updateByPk(UsersDto user) throws Exception;
    int save(UsersDto user) throws Exception;
    int updatePermissionByUIdAndPw(UsersDto user) throws Exception;
    int deleteByUIdAngPw(String uId,String pw) throws Exception;

}

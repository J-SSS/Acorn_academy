package com.acorn.s01_springstartstudy.mapper;

import com.acorn.s01_springstartstudy.dto.UsersDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //Mybatis db컨테이너에서 객체 구현 후 관리
public interface UsersMapper {
    List<UsersDto> findAll();
    UsersDto findByUId(String uId); //String uId == #{uId}
    int update(UsersDto user);
}

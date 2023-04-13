package com.acorn.webappboard.service;

import com.acorn.webappboard.dto.UsersDto;

//기획=> 와이어프레임 (ux ui)=>service=>dao
public interface UsersService {
    UsersDto login(String uId,String pw) throws Exception; //로그인
    UsersDto detail(String uId) throws Exception;//개인 상세정보
    UsersDto idCheck(String uId) throws Exception;//회원가입시 중복 아이디 체크
    int modify(UsersDto user) throws Exception;//개인 정보수정
    int register(UsersDto user) throws Exception;//회원 가입
    int closeAccount(UsersDto user) throws Exception; //비공개  permission="PRIVATE"
    int dropOut(String uId,String pw) throws Exception; //탈퇴 (삭제)

}

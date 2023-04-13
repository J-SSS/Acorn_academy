package com.example.webapptest.service;


import com.example.webapptest.dto.UsersDto;

//기획 => 와이어프레임(ux ui) =>serivce => dao
//구현 => 반대로
public interface UsersService {
    UsersDto login(String uId, String pw); //로그인
    UsersDto detail(String uId); //상세정보
    UsersDto idCheck(String uId); //중복아이디 체크
    int modify(UsersDto user); //개인정보 수정
    int register(UsersDto user); //회원가입
    int closeAccount(UsersDto user); //비공개
    //회원탈퇴 =>삭제x, permission = "PRIVATE"
    int dropOut(String uId,String pw); //탈퇴(삭제)

}

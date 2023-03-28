package com.acorn.s01_springstartstudy.dto;

import lombok.*;

//컴파일(java->class)할때 자동으로 무엇이가 하는 것??? 어노테이션!!!
//@Getter
//@Setter
//@NoArgsConstructor
//@EqualsAndHashCode
//@ToString
@Data
public class UsersDto {

    private String uId;
    private String pw;
    private String name;
    private String phone;
    private String imgPath;
    private String email;
    private java.util.Date postTime;
    private String birth; //유닉스시간을 기준으로 하면 1970 이전에 태어난 사람을 저장할 수 없어서...
    private String gender;
    private String address;
    private String detailAddress;
    private String permission;

}

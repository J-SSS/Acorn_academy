package com.example.webapptest.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//컴파일(java->class)할 때 자동으로 무엇인가 하는것?? 어노테이션!!
/*
getter
setter
noargsconstructor
equalsandhashcode
tostring이 모두 포함되는거
-> @Data
 */
@Data
public class UsersDto {
    //DataTransFerObject : db에서 가져온 결과를 맵핑해서 controller와 view에 전달하는 역할
    //변수명은 낙타표기법을 지켜줘야한다.(java는 변수를 낙타표기법으로 한다.)
    //JAP(ORM) Entity를 낙타표기법으로 작성하면 필드로 생각함
    //u_id => findByU_id(paramUid)
    //u_id => findByU_id(u_id) => SELECT * FROM users WHERE u_id=:paramUId(기대)
    //u_id => findByU_id(u_id) => SELECT * FROM users WHERE u.id=:paramUId(실제결과)

    //**db에서 언더바_를 사용하는 이유는 대소문자를 구분하지 않기 때문... 설정으로 대소문자를 구분하게 할 수도 있긴함


    //datavase의 타입과 유사한(맵핑가능한) 자바의 타입으로 명시한다
    private String uId;
    private String pw;
    private String name;
    private String phone;
    private String imgPath;
    private String email;
    private Date postTime;
    private String birth; //date를 사용하면 1970년 이전 출생자를 못씀
    private String gender;
    private String address;
    private String detailAddress;
    private String permission;


}

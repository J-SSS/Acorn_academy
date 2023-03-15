package com.acorn.webappboard.dto;

import lombok.*;

//컴파일(java->class)할때 자동으로 무엇이가 하는 것??? 어노테이션!!!
//@Getter
//@Setter
//@NoArgsConstructor
//@EqualsAndHashCode
//@ToString
@Data //12분까지 쉬었다가 오세요~
public class UsersDto {
    //db 에서 _ 규칙을 사용하는 이유는 대소문자를 구분하지 않기 때문 (설정으로 대소문자를 구분하게 할 수도 있다...)

    //DataTransferObject :db에서 가져온 결과를 맵핑해서 controller 와 view 에 전달하는 역할
    //변수명은 낙타표기법을 지켜줘야한다.(java는 변수를 낙타표기법으로 한다.)
    //JAP(ORM) Entity 를 낙타표기법으로 작성하면 필드로 생각함
    //u_id => findByU_id(paramUId)
    // =>SELECT * FROM users WHERE u_id=:paramUId (기대)
    // =>SELECT * FROM users WHERE u.id=:paramUId (실제로 생성되는 결과)

    //database 의 타입과 유사한(맵핑가능한) 자바의 타입으로 명시한다.
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

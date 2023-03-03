import java.util.Date;

public class test01 {
    public static void main(String[] args) {

        // 자바에서 패키지란??
        // 패키지는 비슷한 기능의 클래스의 집합 (=> 배포하면 lib or app이 된다)
        // 자바에서 패키지는 클래스 이름의 일부(클래스 이름의 충돌을 막는 것)

        // 서울시.은평구.불광동.장동일과 (!=) 강원도.원주시.명륜동.장동일은 다르다!

        Date d = new Date();
        java.util.Date d1 = new java.util.Date(); //컬렉션프레임워크
        java.sql.Date d2 = new java.sql.Date(d.getTime()); //jdbc 패키지

        // 보통 패키지를 프로젝트의 도메인(=웹상에서 유일한 주소) 주소를 사용 => 클래스 이름을 유일하게 만들어준다.


    }
}

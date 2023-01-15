package ch01.ex01.case01;

public class ToStringTest {
	public static void main(String[] args) {
		
		System.out.println();
		
		String s = "1234";
		System.out.println(s.toString());
		
		Integer i = 100;
		System.out.println(i.toString());
	}
}

// java.lang 패키지 (프로그래밍 시 import하지 않아도 자동으로 import됨)
// 많이 사용하는 기본 클래스들이 속한 패키지  예) Object, String, System, Integer, ...

// Object 클래스 - 모든 클래스의 최상위 클래스 (자동상속)
// java.lang.Object 클래스
// 컴파일러가 extends Object를 추가해줌
// 모든 클래스는 Object 클래스를 상속을 받고, 
// Object 클래스의 메소드들 중 일부는 재정의(override)해서 사용할 수 있음

// toString() 메소드
// 객체의 정보를 String으로 바꾸어서 사용할 때 쓰임
// String, Integer 클래스는 이미 재정의돼 있음
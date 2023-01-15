package ch01.ex01; // 프로그램 내에 공간을 분리하는 역할

public class Hello { // 자바에서 실행되는 최소 단위
	
	public static void main(String[] args) { // 프로그램을 구동하기 위한 메소드
		
		System.out.println("hello");
	}
	
}

// Hello.java(소스코드 작성) -> 저장(compile) -> Hello.class(바이트코드) -> 실행(Run) -> "hello" 출력
// 저장(ctrl+s),  실행(ctrl+F11)

/*
 * Q1. 아래 내용을 수행하세요.
 *   - ch01.ex01 패키지 아래에
 *   - Quiz01.java 클래스를 만들고
 *   - "Quiz01 Class 출력"이라는 메시지를 콘솔창에 출력하세요.
 */
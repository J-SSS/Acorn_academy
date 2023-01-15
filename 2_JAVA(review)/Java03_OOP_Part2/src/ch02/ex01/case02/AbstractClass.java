package ch02.ex01.case02;

public abstract class AbstractClass {
	
	abstract String run(); // 추상 메소드
	
	String make() {
		return "";
	}
}

// 추상 메소드를 하나라도 가지면, 추상 클래스가 된다.
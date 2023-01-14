package ch02.ex01.case01;



public abstract class AbstractClass {

	abstract String run(); // 추상 메소드
	
	String make() {
		return "";
	}
}

// 추상 메소드를 하나라도 가지면, 추상 메소드가 된다!
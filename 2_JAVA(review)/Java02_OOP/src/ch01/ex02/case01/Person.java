package ch01.ex02.case01;

public class Person {
	// 필드_멤버 변수 - 객체의 속성(데이터 담음)
	String name;
	int age;
	
	// 메소드_멤버 함수 - 객체 기능 구현
	void setName(String myName) {
		name = myName;
	}
	void setAge(int myAge) {
		age = myAge;
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}

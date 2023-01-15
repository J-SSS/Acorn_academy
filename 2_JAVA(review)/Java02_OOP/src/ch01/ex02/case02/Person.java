package ch01.ex02.case02;

public class Person {  // 접근제한자: private, protected, default, public
	// 필드
	private String name;
	private int age;
	
	// 메소드
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

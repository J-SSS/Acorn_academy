package ch02.ex01.case04;

public class Person {
	// 필드
	String name;
	int age;
	
	// 생성자
	public Person() {
		this("이름없음", 1); // this로 다른 생성자 호출
	}
	
	public Person(String name, int age) {
		this.name = name; // this는 객체 자신을 의미
		this.age = age;
	}
}

// 생성자
// 1. 객체 생성
// 2. 필드 초기화
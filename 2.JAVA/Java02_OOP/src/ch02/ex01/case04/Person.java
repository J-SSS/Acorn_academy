package ch02.ex01.case04;

public class Person {
	//필드
	String name;
	int age;
	
	
	//생성자(객체생성->필드초기화->
	public Person() {
		this("이름없음",1); //this로 다른 생성자를 호출할 수 있음
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
}

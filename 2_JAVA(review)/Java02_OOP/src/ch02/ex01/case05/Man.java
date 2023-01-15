package ch02.ex01.case05;

public class Man {
	// member variable
	String name;
	int age;
	
	// constructor
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Man() {
		this("Sancho", 1);
	}
	
	// method
	public void showManInfo() {
		System.out.printf("%s의 나이는 %d살입니다.\n", name, age);
	}
	
	public Man getMan() {
		return this; // 자신의 주소를 반환하는 this
	}
}

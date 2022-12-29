package ch02.ex01.case04;

public class Man {
	// 필드_member variable
	String name;
	int age;
	
	
	// 생성자_constructor
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Man() {
		this("Sancho",1);
	}
	
	// 메소드_method
	public void showManInfo() {
		System.out.printf("%s의 나이는 %d살입니다.\n", name,age);
	}
	
	public Man getMan() {
		return this; //자신의 주소를 반환하는 this
		
	}
}

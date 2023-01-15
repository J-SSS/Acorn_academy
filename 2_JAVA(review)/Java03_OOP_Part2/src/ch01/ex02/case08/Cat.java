package ch01.ex02.case08;

public class Cat extends Animal {
	// 필드
	private int age;
	
	// 생성자
	public Cat(String animalName, int age) {
		super(animalName);
		this.age = age;
	}
	
	public Cat(String animalName) {
		super(animalName);
	}
	
	public Cat(int age) {
		super();
		this.age = age;
	}
	
	public Cat() { // 오버로딩(overloading)
		super();
	}
	
	// 메소드
	public int getAge() {
		return age;
	}
}

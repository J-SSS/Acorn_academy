package ch01.ex02.case08;

public class Animal {
	// 필드
	private String animalName;
	
	// 생성자
	public Animal() {}
	
	public Animal(String animalName) {
		super(); // Object 클래스(조상_시조_자동상속)
		this.animalName = animalName;
	}
	
	// 메소드
	public String getAnimalName() {
		return animalName;
	}
}

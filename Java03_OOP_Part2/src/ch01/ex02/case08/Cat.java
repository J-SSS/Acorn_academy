package ch01.ex02.case08;

public class Cat extends Animal {

	private int age;
	
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
	
	public Cat() {
		super();
	}
	
	public int getAge() {
		return age;
	}
}

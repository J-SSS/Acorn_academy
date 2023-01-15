package ch01.ex02.case07;

public class Cat extends Animal {
	
	private int age;
	
	public Cat(String animalName, int age) {
		super(animalName);
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}

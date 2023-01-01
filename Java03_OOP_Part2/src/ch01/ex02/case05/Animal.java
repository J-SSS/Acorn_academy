package ch01.ex02.case05;

public class Animal {

	private String species;
	private String habitat;
	
	public Animal(String species, String habitat) {
//		super(); // 아무것도 없으면 Object클래스를 상속받게됨
//		this.species = species;
//		this.habitat = habitat;
		System.out.println("Animal() was called.");
	}
}

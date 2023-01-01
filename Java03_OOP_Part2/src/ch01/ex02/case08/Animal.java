package ch01.ex02.case08;

public class Animal {
	
	private String animalName;

	public Animal(String animalName) {
		super(); //object로부터 상속
		this.animalName = animalName;
	}
	public Animal() {
		super(); //object로부터 상속
	
	}

	public String getAnimalName() {
		return animalName;
	}


	
}

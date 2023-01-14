package ch01.ex02.case04;

public class Animal {

	String habbits;
	String species;
	
	public Animal() {
		System.out.println("Animal() was called");
	}
	
	public void showAnimalInfo() {
		System.out.println("이 메소드는 Animal 클래스 객체와 Animal을 상속받은 객체가 사용할 수 있습니다");
	}
}

package ch01.ex03.case01;

public class Human extends Animal {
	
	public void move() { // @Override 생략가능
		System.out.println("사람이 두 발로 걷습니다..");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

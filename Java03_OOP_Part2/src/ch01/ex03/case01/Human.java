package ch01.ex03.case01;

public class Human extends Animal {
	
	
	@Override //오버라이딩: 덮어쓴다. 재정의한다.//오버라이드 생략 가능
	public void move() { 
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

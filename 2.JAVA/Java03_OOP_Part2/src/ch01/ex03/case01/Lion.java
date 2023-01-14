package ch01.ex03.case01;

public class Lion extends Animal {
	
	@Override //오버라이딩: 덮어쓴다. 재정의한다.
	
	public void move() {
		System.out.println("사자가 두 다리로 달립니다.");
	}
	
	
	public void hunt() {
		System.out.println("사자가 사냥을 합니다.");
	}
}

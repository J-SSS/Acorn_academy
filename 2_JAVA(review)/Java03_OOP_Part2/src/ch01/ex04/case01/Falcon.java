package ch01.ex04.case01;

public class Falcon extends Animal {

	@Override
	public void move() {
		System.out.println("매가 두 날개로 하늘을 납니다.");
	}
	
	public void pectAt() {
		System.out.println("매가 모이를 쫍니다.");
	}
}

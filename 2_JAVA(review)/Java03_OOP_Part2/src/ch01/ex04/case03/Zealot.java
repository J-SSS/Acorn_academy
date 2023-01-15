package ch01.ex04.case03;

public class Zealot extends Protoss {
	
	@Override
	public void attack() {
		System.out.println("질럿의 공격");
	}
	
	@Override
	public void depense() {
		System.out.println("질럿의 방어");
	}
	
	public void move() {
		System.out.println("질럿이 움직인다.");
	}
}

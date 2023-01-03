package ch02.ex01.case04;

public class Main {
	public static void main(String[] args) {
		
		//new Appliance : 추상클래스는 생성불가
		new Fridge().powerOff();// 추상클래스를 상속받은 Fridge는 일반클래스이므로 생성가능
		
	}
}

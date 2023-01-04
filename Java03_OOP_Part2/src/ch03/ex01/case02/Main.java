package ch03.ex01.case02;

public class Main {
	public static void main(String[] args) {
		
		//Appliance는 new로 생성불가. 인터페이스이기때문에.
		
		new Fridge().PowerOff();
		new Fridge().PowerOn();
	}
}

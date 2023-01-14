package ch03.ex01.case02;

public class Fridge implements Appliance {
	//추상메소드와 비슷하게 생겼으나, 상속하다의 개념이 아닌 구현하다의 개념임.
	@Override
	public void PowerOn() {
		System.out.println("냉장고를 켜다");
		
	}

	@Override
	public void PowerOff() {
		System.out.println("냉장고를 끄다");
	}

}

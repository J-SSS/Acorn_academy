package ch02.ex01.case04;

public class Fridge extends Appliance {

	@Override
	void powerOn() {
		System.out.println("냉장고의 전원을 켜다.");
	}

	@Override
	void powerOff() {
		System.out.println("냉장고의 전원을 끄다.");
	}
}

// 추상 클래스의 추상 메소드는 상속받은 자식 클래스에서 구현해야 한다. (강제됨)
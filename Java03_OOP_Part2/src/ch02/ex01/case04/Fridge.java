package ch02.ex01.case04;

public class Fridge extends Appliance {
	//Appliance를 추상메소드를 가지고 있기 때문에 일반클래스에서 그냥 상속하면 에러발생
	//->일반 클래스에서는 추상메소드를 사용할 수 없으므로!!
	//extends Appliance로 상속하려면 오버라이딩해서 블록을 만들어줘야함
	//== 추상 클래스의 추상메소드는 상속받은 자식클래스에서 구현해야한다(강제성ㅇ)
	@Override
	void powerOn() {
		System.out.println("냉장고의 전원을 켜다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	void powerOff() {
		System.out.println("냉장고의 전원을 끄다.");
		// TODO Auto-generated method stub
		
	}

}


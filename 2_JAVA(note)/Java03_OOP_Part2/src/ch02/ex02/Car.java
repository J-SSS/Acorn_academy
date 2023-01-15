package ch02.ex02;

public abstract class Car {

	public abstract void drive(); // 추상메소드 : 자식 클래스가 구현해줌
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	final public void run() { //템플릿 메소드 - 시나리오 (final)로 선언하면 하위클래스에서 재정의 할 수 없음.
		startCar();
		drive();
		stop();
		turnOff();
	}
}

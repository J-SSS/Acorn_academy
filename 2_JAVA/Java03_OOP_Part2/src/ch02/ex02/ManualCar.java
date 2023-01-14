package ch02.ex02;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전 합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("사람이 멈춥니다.");
	}

}

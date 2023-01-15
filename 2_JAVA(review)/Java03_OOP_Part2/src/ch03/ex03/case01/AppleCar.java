package ch03.ex03.case01;

public class AppleCar implements SmartCar {

	@Override
	public void start() {
		System.out.println("Apple start.");
	}

	@Override
	public void stop() {
		System.out.println("Apple stop.");
	}

	@Override
	public void klaxon() {
		System.out.println("Apple klaxon.");
	}
}

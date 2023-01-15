package ch03.ex03.case01;

public class MyCar implements SmartCar {

	private SmartCar software; // Has-A 관계(composition)
	
	public MyCar(SmartCar software) { // 의존객체(dependency): 멤버변수에 투입되는 객체
		this.software = software;	  // DI(Dependency Injection): 생성자에서 의존객체를 매개변수에 넣는 작업
	}
	
	@Override
	public void start() {
		software.start();
	}

	@Override
	public void stop() {
		software.stop();
	}

	@Override
	public void klaxon() {
		software.klaxon();
	}
}

package ch03.ex03.case02.presentation;

import ch03.ex03.case02.service.Service;

public class Io {
	
	private Service service; // Has-A 관계. Io has a Service
	
	public Io(Service service) { // DI
		this.service = service;
	}
	
	public void setService(Service service) { // DI
		this.service = service;
	}
	
	public void greet() {
		System.out.println(service.greet()); // Service로부터 받은 리턴값을 Io가 화면에 출력하는 데 이용
	}
}

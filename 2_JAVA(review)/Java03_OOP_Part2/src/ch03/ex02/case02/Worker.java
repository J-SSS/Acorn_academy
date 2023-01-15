package ch03.ex02.case02;

public class Worker {
	// 필드_멤버변수
	final String COMPANY = "Google"; // 상수
	final String regNumber;
	String name;
	
	// 생성자(constructor)	
	public Worker(String regNumber, String name) {
		this.regNumber = regNumber;
		this.name = name;
	}
}

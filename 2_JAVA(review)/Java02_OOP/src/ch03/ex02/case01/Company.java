package ch03.ex02.case01;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}

/*
	싱글톤 패턴(Singleton pattern) - static 응용
	- 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
	- static 변수, 메소드를 활용하여 구현 가능
*/
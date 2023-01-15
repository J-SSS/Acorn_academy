package ch03.ex01.case03;

public class Main {
	public static void main(String[] args) {
		
		Computer computer;		    // 인터페이스 타입의 레퍼런스 변수 선언 가능
//		computer = new Computer();  // 인터페이스는 객체를 생성할 수 없다.
		
		Computer desktop = new Desktop();
		desktop.getOnline(); // 오버라이딩(다형성)
	}
}

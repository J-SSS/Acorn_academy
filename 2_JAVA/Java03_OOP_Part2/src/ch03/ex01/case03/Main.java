package ch03.ex01.case03;

public class Main {
	public static void main(String[] args) {
		
		Computer computer; // 인터페이스 타입의 레퍼런스 변수는 생성 가능
		//computer = new Computer(); 객체 생성은 불가
		
		Computer desktop = new Desktop();
		desktop.getOnline(); // 오버라이딩(다형성)
	}
}

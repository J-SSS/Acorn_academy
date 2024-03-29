package ch02.ex01.case01;

public class OuterClass {
	// 필드_멤버변수(속성)
	private int num = 100;		   // 인스턴스 변수
	private static int sNum = 200; // 클래스/정적(static) 변수
	private InnerClass inClass;
	
	public OuterClass() {
		inClass = new InnerClass();
	}
	
	class InnerClass { // 인스턴스 내부 클래스
		int inNum = 300;
		
		void showInnerInfo() {
			System.out.println("OuterClass num = " + num);
			System.out.println("OuterClass sNum = " + sNum);
			System.out.println("InnerClass inNum = " + inNum);
		}
	}
	
	public void callInnerMethod() {
		inClass.showInnerInfo();
	}
}

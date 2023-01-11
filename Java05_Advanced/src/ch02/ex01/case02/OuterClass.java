package ch02.ex01.case02;

public class OuterClass {

	private int num =100;			// 인스턴스 변수
	private static int sNum = 200; // 클래스/정적(static) 변수
	private InnerClass inClass;
	
	public OuterClass() {
		inClass = new InnerClass();
	}
	
	static class InnerClass { // static 내부 클래스
		int inNum =300;
		static int sInNum = 600;
		void showInnerInfo() { // static 클래스의 일반 메소드
//			System.out.println("OuterClass num = " + num);
			System.out.println("OuterClass num = " + sNum);
			System.out.println("InnerClass num = " + inNum);
		}
		
		static void showInnerInfo2() {
			//num = 500;
			//inNum = 400;
			System.out.println("OuterClass num = " + sNum);
			System.out.println("StaticInnerClass sInNum = " + sInNum);
			
		}
	}
	
	public void callInnerMethod() {
		inClass.showInnerInfo();
	}
}

//내부클래스
/*
 * - 클래스 내부에 선언한 클래스(중첩클래스)
 * - 실무에서는 잘 안쓰이는데
 * - 람다식, 스트림 쓰려면 알아야함
 * - 스트림은 자료정리에 유용
 * 
 * 
 * - 내부클래스의 종류
 * - 인스턴스 내부클래스, 
 * - 정적(static)내부 클래스, 
 * - 지역(local)내부 클래스
 * - 익명 내부 클래스(anonymous class)
 * */

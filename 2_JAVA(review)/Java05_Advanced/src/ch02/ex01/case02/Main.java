package ch02.ex01.case02;

public class Main {
	public static void main(String[] args) {
		
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = new OuterClass.InnerClass();
		
		in.showInnerInfo();  // static 내부 클래스 일반 메소드 호출
		in.showInnerInfo2();
		
		System.out.println();
		
		OuterClass.InnerClass.showInnerInfo2(); // static 내부 클래스 static 메소드 호출
	}
}

// static 내부 클래스는 외부 클래스를 사용하지 않고
// 바로 static 내부 클래스 객체 생성
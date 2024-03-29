package ch02.ex01.case01;

import ch02.ex01.case01.OuterClass.InnerClass;

public class InnerClassMain {
	public static void main(String[] args) {
		// 외부 클래스를 이용하여 내부 클래스의 기능 호출
		OuterClass out = new OuterClass();
		out.callInnerMethod();
		
		System.out.println();
		
		// 외부 클래스의 변수를 이용하여 내부 클래스 생성
		OuterClass.InnerClass in = out.new InnerClass();
		in.showInnerInfo();
	}
}

package ch02.ex01.case01;

public class Main {
	public static void main(String[] args) {
		
		// 외부 클래스를 이용하여 내부 클래스의 기능 호출
		OuterClass out = new OuterClass();
		out.callInnerMethod();
		
		System.out.println();
		
		// 외부 클래스의 변수를 이용하여 내부 클래스 생성
		OuterClass.InnerClass inClass = out.new InnerClass();
		inClass.showInnerInfo();
		
		
		//실무적으로는 안쓰니까, 아! 정도로만....
		//익명클래스가 내부클래스의 한종류라는것정도만...
	}
}

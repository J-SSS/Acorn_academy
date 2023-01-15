package ch02.ex02.case02;

public class OuterClass {
	// 필드
	int outNum = 100; // 인스턴스 변수	
	
	// 메소드
	Runnable getRuannable(int i) {	
		int localNum = 200;
		
		class LocalInner implements Runnable { // 지역내부클래스(local inner class)
			int innerNum = 300;
			
			@Override
			public void run() {
				System.out.println("OuterClass의 outNum = " + outNum);
				System.out.println("메소드의 매개변수 i = " + i);
				System.out.println("메소드 안의 num = " + localNum);
				System.out.println("LocalInner의 innerNum = " + innerNum);
			} 
		}	
		
		return new LocalInner(); // 업캐스팅
	}
}

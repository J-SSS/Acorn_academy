package ch02.ex02.case01;

public class OuterClass {
	
	// 메소드
	Runnable getRuannable(int i) {
		
		class LocalInner implements Runnable { // 지역내부클래스(local inner class)
			@Override
			public void run() {} // Runnable 타입을 만듦.
		}
		
		return new LocalInner(); // 업캐스팅
	}
}
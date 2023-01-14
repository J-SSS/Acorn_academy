package ch02.ex02.case02;

public class OuterClass {

	//필드
	int outNum =100;
	
	Runnable getRunnalbe(int i) {
		int localNum = 200;
		
		
		class LocalInner implements Runnable{ //local inner class
			int innerNum = 300;
			
			@Override
			public void run() {//Runnable 타입을 만드는 메소드
				System.out.println("OuterClass의 outNum = " + outNum);
				System.out.println("메소드의 매개변수 i = " + i);
				System.out.println("메소드 안의 num = " + localNum);
				System.out.println("LocalInner의 innerNum = " + innerNum);
			} 
		}
		return new LocalInner();
	}
}

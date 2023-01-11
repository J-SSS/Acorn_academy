package ch02.ex02.case01;

public class OuterClass {

	Runnable getRunnalbe(int i) {
		class LocalInner implements Runnable{ //local inner class
			@Override
			public void run() {} //Runnable 타입을 만드는 메소드
		}
		return new LocalInner();
	}
}

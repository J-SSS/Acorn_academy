package ch06.ex01.case02;

public class MyThread extends SuperClass implements Runnable { // 쓰레드 만드는 방법 2

	@Override
	public void run() {
		int i;
		for (i=0; i<200; i++) {
			System.out.print(i + "\t");
		}
	} 
}

// 단일상속이므로
// 이미 다른 부모(super) 클래스를 상속받은 상태일 때, Runnable 인터페이스를 구현하여 쓰레드를 만듦
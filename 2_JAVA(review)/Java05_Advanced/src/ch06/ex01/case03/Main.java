package ch06.ex01.case03;

public class Main {
	public static void main(String[] args) { // 쓰레드1
		
		System.out.println("main start");
		
		MyThread runnable = new MyThread(); // Runnable 객체를 생성		
		Thread t1 = new Thread(runnable);	// Runnable 객체 삽입  // 쓰레드2
		t1.start();
		
		Thread t2 = new Thread(new MyThread()); // 쓰레드3
		t2.start();
		
		Runnable run = new Runnable() {			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		run.run();
		
		System.out.println("main end");
	}
}

package ch06.ex01.case01;

public class Main {
	public static void main(String[] args) { // 쓰레드3
		
		System.out.println(Thread.currentThread() + " Start");
		
		MyThread t1 = new MyThread(); // 쓰레드1
		MyThread t2 = new MyThread(); // 쓰레드2
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread() + " End");
	}
}

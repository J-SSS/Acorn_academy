package ch06.ex02.case01;

public class Main {
	public static void main(String[] args) { // Thread 우선순위
		
		PriorityThread p1 = new PriorityThread();
		PriorityThread p2 = new PriorityThread();
		PriorityThread p3 = new PriorityThread();
		
		p1.setPriority(Thread.MIN_PRIORITY);	// 1
		p2.setPriority(Thread.NORM_PRIORITY);   // 5
		p3.setPriority(Thread.MAX_PRIORITY);	// 10
		
		p1.start();
		p2.start();
		p3.start();
	}
}

package ch06.ex03.case01;

public class Main {
	public static void main(String[] args) { // 쓰레드3
		
		System.out.println(Thread.currentThread() + " Start");
		
		JoinThread jt1 = new JoinThread(1, 50);   // 쓰레드1
		JoinThread jt2 = new JoinThread(51, 100); // 쓰레드2
		
		jt1.start();
		jt2.start();
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		System.out.println("lastTotal = " + lastTotal);
		
		System.out.println(Thread.currentThread() + " End");
	}
}

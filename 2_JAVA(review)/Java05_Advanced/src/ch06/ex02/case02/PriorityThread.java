package ch06.ex02.case02;

public class PriorityThread extends Thread {
	
	@Override
	public void run() {
		int sum = 0;
		
		Thread t = Thread.currentThread();
		System.out.println(t + " start");
		
		for (int i=0; i<=1000000; i++) {
			sum += i;
		}
		
		System.out.println(t.getPriority() + " end");
	}
}

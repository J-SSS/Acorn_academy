package ch06.ex02.case02;


public class Main {
	public static void main(String[] args) {
		
		int i;
		for (i=Thread.MIN_PRIORITY; i<=Thread.MAX_PRIORITY; i++) {
			PriorityThread mt = new PriorityThread();
			mt.setPriority(i);
			mt.start();
		}
	}
}

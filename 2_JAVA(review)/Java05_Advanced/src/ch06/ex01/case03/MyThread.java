package ch06.ex01.case03;

public class MyThread implements Runnable {

	@Override
	public void run() {
		int i;
		for (i=0; i<200; i++) {
			System.out.print(i + "\t");
		}
	} 
}

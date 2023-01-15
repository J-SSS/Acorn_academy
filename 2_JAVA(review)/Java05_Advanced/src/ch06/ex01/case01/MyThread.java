package ch06.ex01.case01;

public class MyThread extends Thread { // 쓰레드 만드는 방법1
	
	public void run() {
		int i;
		for (i=0; i<200; i++) {
			System.out.print(i + "\t");
		}
	}
}

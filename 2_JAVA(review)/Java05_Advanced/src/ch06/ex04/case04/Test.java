package ch06.ex04.case04;

public class Test {
	
	public static Account account = new Account();	// Shared Resource
	
	public static void main(String[] args) throws InterruptedException {
		
		Adam a = new Adam();	
		a.start(); // Adam이 먼저 3000을 입금
		
		Thread.sleep(200); // 0.2초 있다가
		
		AdamWife aw = new AdamWife(); // AdamWife의 쓰레드를 돌림
		aw.start();
	}
}

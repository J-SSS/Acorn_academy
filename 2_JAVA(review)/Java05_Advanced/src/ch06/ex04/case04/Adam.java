package ch06.ex04.case04;

public class Adam extends Thread {

	@Override
	public void run() {
		synchronized (Test.account) {
			System.out.println("Save Start");
			Test.account.saveMoney(3000);
			System.out.println("saveMoney(3000): " + Test.account.getMoney()); // 입금(적금) 결과
		}
	}
}

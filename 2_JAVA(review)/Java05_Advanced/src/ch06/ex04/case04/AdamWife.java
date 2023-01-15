package ch06.ex04.case04;

public class AdamWife extends Thread {

	@Override
	public void run() {
		synchronized (Test.account) {
			System.out.println("Minus Start");
			Test.account.minusMoney(1000);
			System.out.println("minusMoney(1000): " + Test.account.getMoney()); // 출금 결과
		}
	}
}

// 동기화(synchronization) -> 순서 (동시 X)
// 두 개의 thread가 같은 객체에 접근할 경우, 동시에 접근함으로써 오류가 발생하는데
// 동기화는 공유자원을 lock하여 다른 thread의 접근을 제어

// synchronized 메소드
// 현재 이 메소드가 속해있는 객체에 lock을 건다.

// synchronized 블록
// 현재 객체 또는 다른 객체를 lock으로 만든다.

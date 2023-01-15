package ch02.ex02.quiz.case01;

public class Worker {
	// 필드
	String workerName;
	int money;
	
	// 생성자
	public Worker(String workerName, int money) {
		this.workerName = workerName;
		this.money = money;
	}
	
	// 메소드
	public void takeTaxi(Taxi taxi) {
		taxi.take(5000);
		this.money -= 5000;
	}
	
	public void showWorkerInfo() {
		System.out.printf("%s님의 잔액은 %d원입니다.", workerName, money);
	}
}

package ch02.ex02.quiz.case02;

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
	public void takeBus(Bus bus) {
		bus.take(2000);
		this.money -= 2000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(3000);
		this.money -= 3000;
	}
	
	public void showWorkerInfo() {
		System.out.printf("%s님의 남은 돈은 %d원입니다.\n", 
				workerName, money);
	}
}

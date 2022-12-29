package ch01.ex01.quiz.Quiz14;

public class Worker {

	String workerName;
	int money;
	
	
	public Worker(String workerName, int money) {
		super();
		this.workerName = workerName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(2000);
		this.money -= 2000;
	}
	
	
	public void showWorkerInfo() {
		System.out.printf("%s님의 남은 돈은 %d원입니다.\n", workerName, money);
	}
	
	
}

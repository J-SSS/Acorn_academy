package ch01.ex01.quiz.Quiz14;

public class Bus {
	int busNum;
	int income;
	int passengerCnt;
	
	public Bus(int busNum) {
		
		this.busNum = busNum;
	}
	
	public void take(int money) {
		this.income += money;
		passengerCnt++;
	}
	
	public void showBusInfo() {
		System.out.printf("%d번 버스의 승객은 %d명이고, 수입은 %d원입니다.\n", busNum, passengerCnt, income);
	}
	
}

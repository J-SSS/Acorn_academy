package ch02.ex02.quiz.case02;

public class Bus {
	// 필드
	int busNum;
	int income;
	int passengerCnt;
	
	// 생성자
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	// 메소드
	public void take(int money) {
		this.income += money;
		passengerCnt++;
	}
	
	public void showBusInfo() {
		System.out.printf("%d번 버스의 승객은 %d명이고, 수입은 %d원입니다.\n",
				busNum, passengerCnt, income);
	}
}

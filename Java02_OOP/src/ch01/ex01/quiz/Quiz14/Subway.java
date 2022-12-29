package ch01.ex01.quiz.Quiz14;

public class Subway {
	int lineNum;
	int income;
	int passengerCnt;
	
	public Subway(int lineNum) {
		
		this.lineNum = lineNum;
	}
	
	public void showBusInfo() {
		System.out.printf("%d호선 지하철의 승객은 %d명이고, 수입은 %d원입니다.\n", lineNum, passengerCnt, income);
	}
	
}

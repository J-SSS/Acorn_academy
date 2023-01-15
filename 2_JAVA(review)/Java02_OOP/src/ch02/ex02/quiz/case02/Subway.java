package ch02.ex02.quiz.case02;

public class Subway {
	// 필드
	int lineNum;
	int income;
	int passengerCnt;
	
	// 생성자
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}
	
	// 메소드
	public void take(int money) {
		this.income += money;
		passengerCnt++;
	}
	
	public void showSubwayInfo() {
		System.out.printf("%d호선 지하철의 승객은 %d명이고, 수입은 %d원입니다.\n",
				lineNum, passengerCnt, income);
	}
}

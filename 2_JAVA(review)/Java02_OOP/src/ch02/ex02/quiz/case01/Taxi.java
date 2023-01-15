package ch02.ex02.quiz.case01;

public class Taxi {
	// 필드
	String companyName;
	int income;
	
	// 생성자
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	// 메소드
	public void take(int money) {
		this.income += money;
	}
	
	public void showTaxiInfo() {
		System.out.printf("%s사의 수입은 %d원입니다.\n", companyName, income);
	}
}

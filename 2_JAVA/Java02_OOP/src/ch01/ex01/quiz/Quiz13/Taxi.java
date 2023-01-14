package ch01.ex01.quiz.Quiz13;

public class Taxi {
	
	String companyName;
	int income;
	
	public Taxi(String companyName) {
		
		this.companyName = companyName;
		
	}
	
	public void take(int money) {
		this.income += money;
	}
	
	public void showTaxiInfo() {
		System.out.printf("%s사의 수입은 %d원입니다", companyName, income);
	}
	
	
}

package ch03.ex01.quiz.Quiz01;

public class Bank {
	
	String num;
	int balance;
	static double rate;
	
	static void perSet(double a) {
		Bank.rate = a;

	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		String msg = "###" + num + "###\n";
		msg	+= "잔액 : " + balance + "\n";
		msg	+= "이자율 : " + rate + "\n";
		return msg;
	}
	
	
}

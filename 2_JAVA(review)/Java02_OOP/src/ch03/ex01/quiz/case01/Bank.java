package ch03.ex01.quiz.case01;

public class Bank {
	
	private String accountNum;
	private int balance;
	private static double rate;
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		Bank.rate = rate;
	}
	
	@Override
	public String toString() {
		String msg = "### " + accountNum + " ###\n";
		msg += "잔액: " + balance + "\n";
		msg += "이자율: " + rate + "\n";
		return msg;
	}
}

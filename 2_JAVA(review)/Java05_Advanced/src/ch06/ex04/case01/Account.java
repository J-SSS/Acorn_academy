package ch06.ex04.case01;

public class Account {
	
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}		
		setMoney(m + save);
	}
	
	public void minusMoney(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.println(e);
		}		
		setMoney(m - minus);
	}
}

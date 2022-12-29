package ch02.ex02.case03;

public class Bread {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() { //object 클래스로부터 자동 상속돼있음
		return String.format("가격이 %d원인 빵", price);
	}
	
	
}

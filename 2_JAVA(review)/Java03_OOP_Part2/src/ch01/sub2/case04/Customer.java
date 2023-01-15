package ch01.sub2.case04;

public class Customer { // 일반 고객
	// 필드_멤버변수(속성)
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	// 생성자	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	// 메소드
	public void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트를 적립
		return price;
	}
	
	public String showCustomerInfo() {
		return String.format("%s님의 등급은 %s이며, 보너스 포인트는 %d입니다.", 
				customerName, customerGrade, bonusPoint);
	}
	
	// getters, setters
	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
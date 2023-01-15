package ch01.sub2.case04;

public class VIPCustomer extends Customer {
	
	double salesRatio; // 가격 할인율(VIP만)
	
	public VIPCustomer(int customerID, String customerName) {
//		super(0, "");
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트를 적립
		return price - (int)(price * salesRatio); // 할인율(10%)만큼 가격을 깎아줌
	}
}

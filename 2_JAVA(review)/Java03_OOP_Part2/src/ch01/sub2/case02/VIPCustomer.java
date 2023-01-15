package ch01.sub2.case02;

public class VIPCustomer extends Customer {
	
	double salesRatio; // 가격 할인율(VIP만)
	
	public VIPCustomer(int customerID, String customerName) {
//		super(0, "");
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
}

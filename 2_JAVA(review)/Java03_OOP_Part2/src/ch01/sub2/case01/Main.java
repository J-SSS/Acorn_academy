package ch01.sub2.case01;

public class Main {
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setCustomerID(1001);
		c1.setCustomerName("송중기");
		c1.bonusPoint = 1000;
		System.out.println(c1.showCustomerInfo());
		
		VIPCustomer v1 = new VIPCustomer();
		v1.setCustomerID(1002);
		v1.setCustomerName("이하늬");
		v1.bonusPoint = 2000;
		System.out.println(v1.showCustomerInfo());
	}
}

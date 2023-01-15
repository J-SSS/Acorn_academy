package ch01.sub2.case02;

public class Main {
	public static void main(String[] args) {
		
		Customer c1 = new Customer(1001, "송중기");
		c1.bonusPoint = 1000;
		System.out.println(c1.showCustomerInfo());
		
		VIPCustomer v1 = new VIPCustomer(1002, "이하늬");
		v1.bonusPoint = 2000;
		System.out.println(v1.showCustomerInfo());
		
		// 타입 변환
		Customer v2 = new VIPCustomer(1234, "none"); // up_casting
//		v2.  // 검색되는 걸 보면 Customer(부모) 것만 사용할 수 있는 거 확인
	}
}
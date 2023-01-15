package ch01.sub2.case03;

public class Main {
	public static void main(String[] args) {
		
		Customer c1 = new Customer(1001, "송중기");
		c1.bonusPoint = 1000;
		System.out.println(c1.showCustomerInfo());
		
		VIPCustomer v1 = new VIPCustomer(1002, "이하늬");
		v1.bonusPoint = 2000;
		System.out.println(v1.showCustomerInfo());
		
		System.out.println();
		
		// 구매 후 (보너스 포인트 적립, 가격 할인율 적용)
		int cPrice = c1.calcPrice(10000);
		int vPrice = v1.calcPrice(10000);
		
		System.out.println(c1.showCustomerInfo() + "그리고 지불금액은 " + cPrice + "원입니다.");
		System.out.println(v1.showCustomerInfo() + "그리고 지불금액은 " + vPrice + "원입니다.");
		
		System.out.println();
		
		// 타입 변환
		Customer vc = new VIPCustomer(1234, "none"); // up_casting
		vc.bonusPoint = 10000;
		int nPrice = vc.calcPrice(10000); // vc. 하면 Customer 타입 것만 보이나, calcPrice() 메소드는 오버라이딩된 게 우선하여 호출된다.
		System.out.println(vc.showCustomerInfo() + "그리고 지불금액은 " + nPrice + "원입니다.");
	}
}

package ch01.sub2.case04;

import java.util.ArrayList;

public class Main { // 다형성(polymorphism)
	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<>();
		
		Customer c1 = new Customer(1001, "송중기");
		Customer v1 = new VIPCustomer(1002, "이하늬");  // up_casting
		Customer g1 = new GoldCustomer(1003, "최수종"); // up_casting
		
		list.add(c1);
		list.add(v1);
		list.add(g1);
				
		System.out.println("===== 고객 정보 출력 =====");
		for (Customer c : list) {
			System.out.println(c.showCustomerInfo());
		}
		
		System.out.println();
		
		System.out.println("===== 할인된 가격과 보너스 포인트 계산 =====");
		int price = 10000;
		for (Customer c : list) {
			int cost = c.calcPrice(price);
			System.out.println(c.customerName + "님이 " + cost + "원을 지불하셨습니다.");
			System.out.println(c.customerName + "님의 현재 보너스 포인트는 " + c.bonusPoint + "점입니다.");
		}
	}
}

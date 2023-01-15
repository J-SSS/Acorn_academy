package ch01.ex01.quiz.case02;

import java.time.LocalDate;
import java.time.LocalTime;

public class OrderTest {
	public static void main(String[] args) {
		
		Order o = new Order();
		
		o.orderNumber = "1001";
		o.customerPhone = "010-1111-2222";
		o.customerAddress = "서울시 강남구 역삼동 111";
		o.price = 35000;
		o.orderDate = LocalDate.now();
		o.orderTime = LocalTime.now().withNano(0);
		
		o.showOrderInfo();
	}
}

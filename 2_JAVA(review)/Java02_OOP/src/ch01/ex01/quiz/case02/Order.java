package ch01.ex01.quiz.case02;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
	
	String orderNumber;
	String customerPhone;
	String customerAddress;
	int price;
	LocalDate orderDate;
	LocalTime orderTime;
	
	void showOrderInfo() {
		System.out.println("주문 접수번호: " + orderNumber);
		System.out.println("주문 전화번호: " + customerPhone);
		System.out.println("주문 집주소: " + customerAddress);
		System.out.println("주문 가격: " + price);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시각: " + orderTime);
	}
}

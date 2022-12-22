package ch01.ex01.quiz.Quiz02;

public class Order {
	int ordernum;
	String ordertel;
	String adress;
	int price;
	
	void orderInfo() {
		System.out.println("주문 접수번호 : " + ordernum);
		System.out.println("주문 전화번호 : " + ordertel);
		System.out.println("주문 집주소 : " + adress);
		System.out.println("주문 가격 : " + price);
	}
}

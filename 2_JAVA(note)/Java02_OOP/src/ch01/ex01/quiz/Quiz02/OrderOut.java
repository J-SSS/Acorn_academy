package ch01.ex01.quiz.Quiz02;

public class OrderOut {
	public static void main(String[] args) {
		Order o = new Order();
		
		o.ordernum = 1001;
		o.ordertel = "010-1111-2222";
		o.adress = "서울시 강남구 역삼동 111";
		o.price = 35000;
		
		o.orderInfo();
		
	}

}

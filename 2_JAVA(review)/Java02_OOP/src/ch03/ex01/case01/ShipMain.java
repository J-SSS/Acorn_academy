package ch03.ex01.case01;

public class ShipMain {
	public static void main(String[] args) {
		
		Ship s1 = new Ship();  // 지역변수 s1(스택 메모리)인 객체(인스턴스) new Ship()(힙 메모리)를 참조
		Ship s2 = new Ship();
		Ship s3 = new Ship();
		
		s1.sail(100);
		s2.sail(200);
		s3.sail(300);
		
		System.out.printf("여객 터미널 용객 수는 %d명입니다.\n", Ship.totalCnt);
		
		System.out.printf("여객 터미널 용객 수는 %d명입니다.\n", s1.totalCnt);
		System.out.printf("여객 터미널 용객 수는 %d명입니다.\n", s2.totalCnt);
		System.out.printf("여객 터미널 용객 수는 %d명입니다.\n", s3.totalCnt);
	}
}

package ch02.ex02.case02;
/*
 *  1. 가격 속성을 가진 사과 클래스 하나 생성
 *  2. 사과를 수확해서 수확한 사과에 가격을 붙이는 기능을 하는 농부 클래스 생성
 *  3. 농부에게 구매한 사과의 가격을 2배로 만들어 파는 기능을 하는 유통업자 클래스 생성
 *  4. 실행용 클래수
 *  	- 농부 한명 생성
 *  	- 유통업자 한명 생성
 *  	- 사과에 가격을 붙여 사과의 판매가를 출력하는 코드를 작성하세요.
 */
public class Main {
	public static void main(String[] args) {

		Farmer f = new Farmer();
		Dealer d = new Dealer();
		
		
		Apple apple = d.sell(f.sell(1000));
		System.out.println(apple.getPrice());
		

		
	}
}

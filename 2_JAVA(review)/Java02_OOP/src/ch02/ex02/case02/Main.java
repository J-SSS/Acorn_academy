/*
 * 1. 가격 속성을 가진 사과 클래스 하나 생성
 * 2. 사과를 수확(생성)해서 수확한 사과에 가격을 붙이는 역할(기능)을 하는 농부 클래스 생성 -> 메소드 1개 (반환타입은 Apple 타입)
 * 3. 농부한테 구매한 사과의 가격을 2배로 만들어 파는 역할(기능)을 하는 유통업자 클래스 생성 -> 메소드 1개 (반환타입은 Apple 타입)
 * 4. 실행용 클래스
 *   - 농부 한명 생성
 *   - 유통업자 한명 생성
 *   - 사과에 가격(1000)을 붙여 사과의 판매가를 출력하는 코드를 작성하세요.
 */
package ch02.ex02.case02;

public class Main {
	public static void main(String[] args) {
		
		Farmer farmer = new Farmer();		// 농부
		Retailer retailer = new Retailer(); // 유통업자
		
		Apple apple = retailer.sell(farmer.sell(1000));
		
		System.out.println(apple.getPrice());
	}
}

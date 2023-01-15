/*
 * 제빵사1은 빵을 만듦고,
 * 제빵사2는 제빵사1이 만든 빵에 가격(2000)을 붙인다.
 * 그 빵의 가격을 출력하세요.
 */
package ch02.ex02.case03;

public class Main {
	public static void main(String[] args) {
		
		Baker baker1 = new Baker();
		Baker baker2 = new Baker();
		Bread bread = null;
		
		bread = baker1.bake(); // 제빵사1이 빵을 만듦
		
		baker2.putPrice(bread, 2000); // 제빵사2는 제빵사1이 만든 빵에 가격(2000)을 붙임
		
		System.out.println(bread); // toString() 생략 가능
	}
}

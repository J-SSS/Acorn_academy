package ch02.ex02.case03;
/*
 *  제빵사1은 빵을 만들고, 제빵사 2는 만들어진 빵에 가격(2000원)을 붙인다/
 *  그 빵의 가격을 출력하세요.
 */
public class Main {
	public static void main(String[] args) {
		
		Baker baker1 = new Baker();
		Baker baker2 = new Baker();
		Bread bread = null;
		
		bread = baker1.bake(); //제빵사1이 빵을 만듬
		
		baker2.putPrice(bread, 2000); //제빵사2는 제빵사1이 만든 빵에 가격을 붙임
		
		System.out.println(bread);
	}
}

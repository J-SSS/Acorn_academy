/*
 * Has-A 관계(composition)
 * 클래스가 다른 클래스를 포함하는 관계
 * 상속하지 않음 
 */
package ch01.ex05.quiz;

public class Main {
	public static void main(String[] args) {
		
		Circle circle = new Circle(new Point(2, 2), 5);
		
		System.out.println(circle);
	}
}

// Circle이 Point를 포함하도록 관계를 수정하여 (상속 X)
// 동일한 결과가 출력이 되도록 코드를 수정하세요.
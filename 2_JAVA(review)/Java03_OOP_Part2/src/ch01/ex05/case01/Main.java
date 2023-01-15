/*
 * Is-A 관계 (상속, inheritance)
 * 상속은 클래스 간의 결합도가 높은 관계
 * 상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음
 * 계층구조가 복잡하거나, 높으면 좋지 않음
 */
package ch01.ex05.case01;

public class Main {
	public static void main(String[] args) {
		
		Circle circle = new Circle(2, 2, 5);
		
		System.out.println(circle); // toString() 생략 가능
		
		String str = new String("김");
		System.out.println(str.toString()); // toString() 생략 가능
		
		
	}
}

package ch01.ex01.case01;

public class DivideTest {
	public static void main(String[] args) {
		
		Divide divide = (int x, int y) -> {return x/ y;}; //람다식 구현
		
		System.out.println(divide.divide(10, 2));
		
		Divide divide2 = (x, y) -> {return x/ y;};
		Divide divide3 = (x, y) -> x/ y;
		// 실행문이 한 문장인 경우 중괄호 생략이 가능하며 return문도 같이 생략
		
		
	}
}

// 람다식
// 함수의 구현과 호출만으로 프로그래밍이 수행되는 방식
// 함수형 프로그래밍(Functional Programming: FP)
// 익명 함수
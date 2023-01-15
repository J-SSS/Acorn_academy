package ch04;

public class BoxingTest {
	public static void main(String[] args) {
		
		System.out.println("자동 unboxing"); // 객체형 => 기본자료형으로 변환
		
		Integer obj = new Integer(10);
		int sum = obj.intValue() + 20; // 객체+기본자료형 => 기본자료형+기본자료형
		System.out.println("sum => " + sum);
		
		System.out.println("자동 boxing"); // 기본자료형 => 객체형
		
		printDouble(new Double(123.45));
		printDouble(143.67); // 143.67 -> new Double(143.67)
	}
	
	static void printDouble(Double obj) { // 매개변수가 객체형으로 전달
		System.out.println(obj.toString()); // 소수점을 문자열로 변환->출력
	}
}

/*
	Wrapper Class
	
	컬렉션 => 데이터(객체)를 저장할 수 있는 구조(List,Set,Map) => 객체만 저장된다.
	기본자료형(8가지)은 저장 X (객체가 아니기 때문에) => 객체형으로 변환(Wrapper Class)

*/
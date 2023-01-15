package ch02.ex01_print;

public class C05Print05 {
	public static void main(String[] args) {
		// 문자열 결합 연산자(+)
		// 문자열 + 문자열
		System.out.println("hello " + "world");
		
		// 문자열 + 정수
		System.out.println("hello" + 100); // "hello" + "100"
		
		// 정수 + 정수 + 문자열
		System.out.println(100 + 200 + "hello"); // "300" + "hello"
		System.out.println("hello" + 100 + 200); // "hello" + "100" + "200"
		System.out.println("hello" + (100 + 200));
		System.out.println(100 + "" + 200 + "hello"); // 100200hello
	}
}

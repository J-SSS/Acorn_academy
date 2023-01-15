package ch02.ex01_print;

public class C05Print05 {
	public static void main(String[] args) {
		// 문자열 결합 연산자(+)
		// 문자열 + 문자열
		System.out.println("hello " + "world");

		// 문자열 + 정수
		System.out.println("hello" + 100); // "hellow" + "100"으로 문자열전염
		
		// 정수 + 정수 + 문자열
		System.out.println(100 + 200); //300
		System.out.println(100 + 200 + "hello"); //300hellow 문자열이 뒤에있으면 전염되지않음
		System.out.println("hellow" + 100 + 200); //hellow100200 문자열이 앞에 있으면 전염됨
		System.out.println("hellow" + (100 + 200)); //hellow300 괄호를 통해 순서 바꿀 수 있음
		
	}
}

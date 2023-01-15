package ch01.ex04;

public class C02Casting {
	public static void main(String[] args) {
		
		int a = 100;
		
		// 자동 타입 변환(int -> double)
		double b = a;
		System.out.println("a: " + a); // 100
		System.out.println("b: " + b); // 100.0
		
		// 강제 타입 변환(double -> int)
		a = (int) b;
		System.out.println("a: " + a); // 100
		System.out.println("b: " + b); // 100.0
		
		// 값 변질
		double c = 1.1234;
		int d = (int) c;
		System.out.println("c: " + c); // 1.1234
		System.out.println("d: " + d); // 1
		
		int num = 10 / 3; // int / int -> int
		System.out.println("num: " + num); // 3
		
		double num2 = 10 / 3; // int / int -> int -> double(자동타입변환)
		System.out.println("num2: " + num2); // 3.0
		
		double num3 = 10.0 / 3; // double/int -> double/double 10.0/3.0
		System.out.println("num3: " + num3); // 3.3333333...
	}
}

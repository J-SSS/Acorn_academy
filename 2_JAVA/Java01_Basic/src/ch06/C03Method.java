package ch06;

import java.util.Scanner;

public class C03Method {
		//	// 멤버 변수_필드
		//	int a;
		//	int b;
		//	
		//	// 멤버 함수_메소드
		//	void f1() {}
	
	
		// 1. 반환값 X 매개변수 X
		// 2. 반환값 O 매개변수 X
		// 3. 반환값 X 매개변수 O
		// 4. 반환값 O 매개변수 O
	
	
		//1. 반환값 X 매개변수 X
	static void subject() { 
		System.out.println("계산기 프로그램");
	}
	
		// 2. 반환값 O 매개변수 X
	static int input() { //main메소드가 static이기 때문에 함수이름만으로 호출하려면 같은 static이어야함
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
		// 4. 반환값 O 매개변수 O
	static int add(int num1, int num2) {
		return num1 + num2;
	}
		// 3. 반환값 X 매개변수 O
	static void output(int sum) {
		System.out.println("두 수의 합: " + sum);
	}
	
	static int input_2(String str) {
		System.out.print(str + " 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	
	
	public static void main(String[] args) {
		
		
		subject();
	
		int num1 = input_2("첫번째"); 
		int num2 = input_2("두번째");
		
		int sum = add(num1, num2);
		
		output(sum);
		
		
	}
	
}

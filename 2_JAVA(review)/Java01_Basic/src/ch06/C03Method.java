package ch06;

import java.util.Scanner;

public class C03Method {
	
	static void subject() { // 1. 반환값 X  매개변수 X
		System.out.println("계산기 프로그램");
	}
/*	
	static int input() { // 2. 반환값 O  매개변수 X
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
*/	
	static int input_2(String str) { // 4. 반환값 O  매개변수 O
		Scanner sc = new Scanner(System.in);
		System.out.print(str + " 정수 입력: ");
		return sc.nextInt();
	}
	
	static int add(int num1, int num2) { // 4. 반환값 O  매개변수 O
		return num1 + num2;
	}
	
	static void output(int sum) { // 3. 반환값 X  매개변수 O
		System.out.println("두 수의 합: " + sum);
	}	
		
	public static void main(String[] args) {
		
		subject();
/*		
		System.out.print("첫번째 정수 입력: ");
		int num1 = input();
		System.out.print("두번째 정수 입력: ");
		int num2 = input();
*/		
		int num1 = input_2("첫번째");
		int num2 = input_2("두번째");
		
		int sum = add(num1, num2);
		
		output(sum);
	}
}

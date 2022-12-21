package ch06;

import java.util.Scanner;

public class Quiz {
	
	
	static int input(String str) {
		System.out.print(str + " 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		}

	static void output(int a, int b) {
		String m = " ";
		switch (b) {
		case 1:
			m = "합";break;
		case 2:
			m = "차";break;
		case 3:
			m = "곱";break;
		case 4:
			m = "몫";
		
		}	
		System.out.println("두 수의 " + m + " : " + a);
	}
	
	static int calc(int a, int b, int c) {
		int result =1;
		
		switch (c) {
		case 1:
			result = a + b;break;
		case 2:
			result = a - b;break;
		case 3:
			result = a * b;break;
		case 4:
			result = a - b;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.print("선택: ");
		int select = sc.nextInt();
		
		int num1 = input("첫번째");
		int num2 = input("두번째");
		
		int result = calc(num1, num2, select);
		
		
		output(result, select);
		

	}
	
	
}

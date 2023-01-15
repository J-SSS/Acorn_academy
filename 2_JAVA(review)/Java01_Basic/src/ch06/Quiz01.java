package ch06;

import java.util.Scanner;

public class Quiz01 {
	
	static int input(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str + " 정수 입력: ");		
		return sc.nextInt();
	}
	
	static int operate(int menu, int num1, int num2) { // 매개변수는 여러 개 가능
		int result = 0;
		
		switch (menu) {
		case 1: result = num1 + num2; break;
		case 2: result = num1 - num2; break;
		case 3: result = num1 * num2; break;
		case 4: result = num1 / num2; 
		}
		
		return result; // 반환값은 무조건 하나만 가능
	}
	
	static void output(String str, int result) {
		System.out.println("두 수의 " + str + ": " + result);
	}
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.print("선택: ");
			int menu = sc.nextInt();
			
			int num1 = input("첫번째");
			int num2 = input("두번째");
			
			int result = 0;
			String str = "";
			switch (menu) {
			case 1:
				result = operate(menu, num1, num2);
				str = "합"; break;
			case 2:
				result = operate(menu, num1, num2);
				str = "차"; break;
			case 3:
				result = operate(menu, num1, num2);
				str = "곱"; break;
			case 4:
				result = operate(menu, num1, num2);
				str = "제"; break;
			}
			
			output(str, result);
		}
	}
}

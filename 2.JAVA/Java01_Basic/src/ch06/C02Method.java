package ch06;

import java.util.Scanner;

public class C02Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기 프로그램");
		System.out.print("첫번째 정수 입력");
		int num1 = sc.nextInt(); 
		System.out.print("두번째 정수 입력");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		
		System.out.println("두 수의 합: " + sum);
	}
	
	
}

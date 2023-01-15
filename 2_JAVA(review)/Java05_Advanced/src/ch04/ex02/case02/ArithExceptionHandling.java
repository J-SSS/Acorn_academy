package ch04.ex02.case02;

import java.util.Scanner;

public class ArithExceptionHandling {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		while (true) {
			System.out.print("나뉨수를 입력하시오: ");
			dividend = sc.nextInt();
			System.out.print("나눗수를 입력하시오: ");
			divisor = sc.nextInt();
			
			try {
				System.out.printf("%d을(를) %d로 나누면 몫은 %d입니다.\n", 
						dividend, divisor, dividend/divisor);
				break;
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
			}
		}
		
		System.out.println("끝");
		
		Exception e;
	}
}

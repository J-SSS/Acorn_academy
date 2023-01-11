package ch04.ex02.case02;

import java.util.Scanner;

public class AirthExcenptinHandling {
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.println("나뉨수를 입력하세요: ");
		dividend = sc.nextInt();
		System.out.println("나눗수를 입력하세요: ");
		divisor = sc.nextInt();
		
		
		try {
			System.out.printf("%d를 %d로 나눈 몫은 %d입니다",dividend, divisor, dividend/divisor);
			System.out.println();
			
			
		}
		catch (ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
		}
		
		System.out.println("끝");
		
	}

}

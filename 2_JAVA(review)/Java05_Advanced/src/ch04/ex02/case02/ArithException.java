package ch04.ex02.case02;

import java.util.Scanner;

public class ArithException {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("나뉨수를 입력하시오: ");
		dividend = sc.nextInt();
		System.out.print("나눗수를 입력하시오: ");
		divisor = sc.nextInt();
		
		System.out.printf("%d을(를) %d로 나누면 몫은 %d입니다.", 
				dividend, divisor, dividend/divisor);
	}
}

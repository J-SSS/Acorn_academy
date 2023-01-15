package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		String result = (num%2==0) ? "짝수" : "홀수";
		System.out.printf("입력하신 값은 %s입니다.", result);
	}
}

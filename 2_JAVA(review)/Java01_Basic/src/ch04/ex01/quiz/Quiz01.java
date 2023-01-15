package ch04.ex01.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		if (num%2 == 0) 
			System.out.println("짝수입니다.");
		else 
			System.out.println("홀수입니다.");
	}
}

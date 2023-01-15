package ch04.ex02.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		// if문
		if (num%2 == 0) 
			System.out.println("짝수입니다.");
		else 
			System.out.println("홀수입니다.");
		
		// switch문
		// 조건문(값/변수/식): 정수(long x), char, String (boolean x)
		switch (num%2) {
		case 0:
			System.out.println("짝수");
		case 1:
			System.out.println("홀수");
		}
	}
}

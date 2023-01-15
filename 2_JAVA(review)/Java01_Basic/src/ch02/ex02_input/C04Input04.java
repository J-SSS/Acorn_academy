package ch02.ex02_input;

import java.util.Scanner;

public class C04Input04 {
	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.println("이름: " + name);
		
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.println("나이: " + age);
		
		System.out.print("점수 입력: ");
		double score = sc.nextDouble();
		System.out.println("점수: " + score);
	}
}

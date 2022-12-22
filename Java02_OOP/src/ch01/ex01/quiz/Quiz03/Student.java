package ch01.ex01.quiz.Quiz03;

import java.util.Scanner;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	
	void studentInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력");
		math = sc.nextInt();
	}
	void studentOut() {
		System.out.println("이름" + name);
		System.out.println("총점" + kor + eng + math);
		System.out.println("평균" + (kor + eng + math)/3);
	}
	
}

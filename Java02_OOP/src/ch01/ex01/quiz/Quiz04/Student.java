package ch01.ex01.quiz.Quiz04;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	
	
	String name;
	int avg;
	int math;
	int eng;
	int kor;
	int sum ;
	
	void info() {
		System.out.print("이름 입력 :");
		name = sc.next();
		System.out.print("국어 점수 입력 :");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 :");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 :");
		math = sc.nextInt();
		System.out.println();
	}
	
	int sum() {
		sum = math + eng + math;
		return sum; 
	}
	double avg() {
		avg = (kor + eng + math)/3;
		return avg; }

	void result() {
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum());
		System.out.println("평균 : " + avg());
		System.out.println();
	}

	
	

	
}

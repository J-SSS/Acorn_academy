package ch01.ex01.quiz.case03;

import java.util.Scanner;

public class Student { // 도메인 클래스_설계도_찍어내는 틀
	// 필드_멤버 변수
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	// 메소드
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		name = sc.next();
		System.out.print("국어 점수 입력: ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = sum / 3.0;
	}
	
	void output() {
		System.out.println("이름: " + name);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}
}

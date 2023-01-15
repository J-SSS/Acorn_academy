package ch01.ex01.quiz.case09;

import java.util.Scanner;

public class StudentService {

	Scanner sc = new Scanner(System.in);	
	
	public int size() {
		System.out.print("등록할 학생 수 입력: ");
		int studentCnt = sc.nextInt();
		return studentCnt;
	}

	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();
		return menu;
	}
	
	public int scoreInput(String subject) {
		System.out.print(subject + " 점수 입력: ");
		return sc.nextInt();
	}

	public void input(Student[] s) {
		for (int i=0; i<s.length; i++) {
			s[i] = new Student();
			System.out.print("이름 입력: ");
			s[i].name = sc.next();
			s[i].kor = scoreInput("국어");
			s[i].eng = scoreInput("영어");
			s[i].math = scoreInput("수학");
			
			s[i].sum = s[i].kor + s[i].eng + s[i].math;
			s[i].avg = s[i].sum / 3.0;
		}
	}

	public void output(Student[] s) {
		for (int i=0; i<s.length; i++) {
			System.out.println("### " + s[i].name + " ###");
			System.out.println("총점: " + s[i].sum);
			System.out.println("평균: " + s[i].avg);
		}
	}
}

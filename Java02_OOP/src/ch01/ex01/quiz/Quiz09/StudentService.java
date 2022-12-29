package ch01.ex01.quiz.Quiz09;

import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);

	
	int num() {
		System.out.print("등록할 학생 수 입력: ");
		int num=sc.nextInt();
		return num; 
	}
	

	void input(Student[] s) {
		for(int i = 0; i <s.length; i++) {

			s[i] = new Student();

		
		System.out.print("이름 입력 : ");
		s[i].name = sc.next();
		System.out.print("국어 점수 입력 : ");
		s[i].kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		s[i].eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		s[i].math = sc.nextInt();
		
		s[i].sum= s[i].kor + s[i].eng + s[i].math; 
		s[i].avg= (s[i].kor + s[i].eng + s[i].math)/3;
		}
	}

	void output(Student[] s) {
		
			for(int i = 0; i<s.length;  i++) {
				System.out.println("###" + s[i].name + "###");
				System.out.println("총점 :" + s[i].sum);
				System.out.println("평균 :" + s[i].avg);
				System.out.println();
		}
		
	}
		

	int menu() {
		System.out.println("1. 입 력");
		System.out.println("2. 출 력");
		System.out.println("0. 종 료");
		int select = sc.nextInt();
		return select;
	}
	
	}


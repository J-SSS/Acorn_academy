package ch02.ex02_input.quiz;

import java.io.IOException;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) throws IOException {
		
/*		//Q1//////////////////////////
		
		 double a = System.in.read();
		 
		 System.out.println("입력 : " + (char)a);
*/		
		//Q2//////////////////////////
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("이름를 입력 하세요!");
		 String name = sc.next();
		 System.out.println("국어점수를 입력 하세요!");
		 int kor = sc.nextInt();
		 System.out.println("영어점수를 입력 하세요!");
		 int eng = sc.nextInt();
		 System.out.println("수학점수를 입력 하세요!");
		 int math = sc.nextInt();
		
		 
		 int sum3 = kor + eng + math;
		 double avg3 = (kor + eng + math)/3.00;
		 
		 System.out.printf("이름: %s 총점 : %d 평균 :%.2f", name , sum3, avg3);
		 
		//Q1//////////////////////////
		//Q1//////////////////////////
		//Q1//////////////////////////
		//Q1//////////////////////////
		 
	}
}

package ch05.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력: ");
		int num = sc.nextInt();
		
		String[] name = new String[num];
		String[] telNum = new String[num];
		
		for (int i=0; i<name.length; i++) {
			System.out.println("### " +(i+1)+ " ###");
			System.out.print("이름 입력: ");
			name[i] = sc.next();
			System.out.print("전화번호 입력: ");
			telNum[i] = sc.next();
		}
		
		for (int i=0; i<num; i++) {
			System.out.println("### " +(i+1)+ " ###");
			System.out.println("이름: " + name[i]);
			System.out.println("전화번호: " + telNum[i]);
		}				 
	}
}

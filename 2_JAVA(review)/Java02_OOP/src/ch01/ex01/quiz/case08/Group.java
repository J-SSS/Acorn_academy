package ch01.ex01.quiz.case08;

import java.util.Scanner;

public class Group {
	
	Scanner sc = new Scanner(System.in);
	String name;
	int inwon;
	String song;
	
	void input() {
		System.out.print("그룹명 입력: ");
		name = sc.next();
		System.out.print("그룹 인원 입력: ");
		inwon = sc.nextInt();
		System.out.println("그룹 대표곡 입력: ");
		song = sc.next();
	}
	
	void output() {
		System.out.println("### " + name + " ###");
		System.out.println("인원수: " + inwon);
		System.out.println("대표곡: " + song);
	}
}

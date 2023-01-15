package ch01.ex02.quiz.Quiz01;

import java.time.LocalDate;

import java.util.Scanner;

public class Man {
	Scanner sc = new Scanner(System.in);
	private String name ;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.print("이름 : ");
		
		this.name = sc.next();
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		System.out.print("나이 : ");
		this.age = sc.nextInt();
	}
	
	void output() {
		System.out.println();
		System.out.println("## 다음 사람을 입력하셨습니다! ##");
		System.out.print("이름 : " + getName());
		System.out.println();
		System.out.print("나이 : " + getAge());
		System.out.println();
		LocalDate d = LocalDate.now();
		System.out.println("등록일 : " + d);
	}
	
}

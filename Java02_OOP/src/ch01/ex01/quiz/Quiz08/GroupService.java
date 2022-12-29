package ch01.ex01.quiz.Quiz08;

import java.util.Scanner;

public class GroupService {
	Scanner sc = new Scanner(System.in);

	int size;
	int select;
	int cnt =1;


	int select(){
		System.out.println();
		System.out.println("1. 입 력");
		System.out.println("2. 출 력");
		System.out.println("0. 종 료");
		select = sc.nextInt();
		return select;
	}

	int size() {
		System.out.print("입력할 그룹 수 :");
		size = sc.nextInt();

		return size;
	}
	

}

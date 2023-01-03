package ch02.quiz.quiz02;

import java.util.Scanner;

public class MainService {
	Scanner sc = new Scanner(System.in);
	int sp;
	int menu() {
		System.out.println("1.입 력");
		System.out.println("2.출 력");
		System.out.println("3.수 정");
		System.out.println("4.삭 제");
		System.out.println("5.종 료");
		System.out.print(">>");
		int select = sc.nextInt();
		return select;
	}
	int menu2(int a) {
		switch(a) {
		case 1:
			System.out.println("1.성적 입력");
			System.out.println("2.교수진 입력");break;
		case 2:
			System.out.println("1.성적 출력");
			System.out.println("2.교수진 출력");break;
		case 3:
			System.out.println("1.성적 수정");
			System.out.println("2.교수진 수정");break;
		case 4:
			System.out.println("1.성적 삭제");
			System.out.println("2.교수진 삭제");break;
		default :
			System.out.println("잘못된입력입니다!");
		}
		System.out.print(">>");
		int select = sc.nextInt();
		return select;
	}
	
}

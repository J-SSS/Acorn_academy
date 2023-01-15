package ch04.ex03.quiz;

import java.util.Scanner;

public class Quiz03 {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택: ");
			
			int menu = sc.nextInt();
			
			boolean end = false;
			switch (menu) {
			case 1:
				System.out.println("입력 페이지입니다.");
				break;
			case 2:
				System.out.println("출력 페이지입니다.");
				break;
			case 3:
				System.out.println("수정 페이지입니다.");
				break;
			case 4:
				System.out.println("삭제 페이지입니다.");
				break;
			case 0:
				System.out.println("프로그램 종료");
				end = true;
				break;
//				return; // 메소드 종료
//				System.exit(0); // 프로그램 강제 종료
			default:
				System.out.println("없는 메뉴 번호입니다.");
			}
			if (end) {
				break;
			}			
		}
	}
}

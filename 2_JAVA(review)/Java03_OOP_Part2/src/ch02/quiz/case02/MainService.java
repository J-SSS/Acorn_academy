package ch02.quiz.case02;

import java.util.Scanner;

public class MainService {
	// 필드
	Scanner sc = new Scanner(System.in);
	ScoreService ss; 
	ProfessorService ps;
	
	// 생성자
	public MainService() {
		ss = new ScoreService();
		ps = new ProfessorService();
	}
	
	// 메소드
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		return sc.nextInt();
	}
	
	public int subMenu(String str) {
		System.out.println("1. 성적 " + str);
		System.out.println("2. 교수진 " + str);
		System.out.print("선택: ");
		int select = sc.nextInt();
		return select;
	}

	public void input(Score[] s, Professor[] p) {
		int select = subMenu("입력");
		
		switch (select) {
		case 1:
			ss.input(s);
			break;
		case 2:
			ps.input(p);
			break;
		default:
			System.out.println("선택된 메뉴가 없습니다.");
		}
	}

	public void output(Score[] s, Professor[] p) {
		int select = subMenu("출력");
		
		switch (select) {
		case 1:
			ss.output(s);
			break;
		case 2:
			ps.output(p);
			break;
		default:
			System.out.println("선택된 메뉴가 없습니다.");
		}
	}

	public void modify(Score[] s, Professor[] p) {
		int select = subMenu("수정");
		
		switch (select) {
		case 1:
			ss.modify(s);
			break;
		case 2:
			ps.modify(p);
			break;
		default:
			System.out.println("선택된 메뉴가 없습니다.");
		}
	}

	public void delete(Score[] s, Professor[] p) {
		int select = subMenu("삭제");
		
		switch (select) {
		case 1:
			ss.delete(s);
			break;
		case 2:
			ps.delete(p);
			break;
		default:
			System.out.println("선택된 메뉴가 없습니다.");
		}
	}
	
}

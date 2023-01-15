package ch01.quiz.case04;

import java.util.Scanner;

public class UserService {
	
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		return sc.nextInt();
	}

	public void input(UserChild2[] uc) {
		uc[cnt] = new UserChild2();
		
		System.out.print("아이디 입력: ");
		uc[cnt].setId(sc.next());
		System.out.print("패스워드 입력: ");
		uc[cnt].setPw(sc.next());
		System.out.print("이름 입력: ");
		uc[cnt].setName(sc.next());
		System.out.print("이메일 입력: ");
		uc[cnt].setEmail(sc.next());
		System.out.print("나이 입력: ");
		uc[cnt].setAge(sc.nextInt());
		cnt++;
	}

	public void output(UserChild2[] uc) {
		if (cnt == 0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i=0; i<cnt; i++) {
				System.out.println("아이디: " + uc[cnt].getId());
				System.out.println("패스워드: " + uc[cnt].getPw());
				System.out.println("이름: " + uc[cnt].getName());
				System.out.println("이메일: " + uc[cnt].getEmail());
				System.out.println("나이: " + uc[cnt].getAge());
			}
		}
	}

}

package ch02.quiz.case02;

import java.util.Scanner;

public class ScoreService {
	
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	public void input(Score[] s) {
		if (s.length == cnt) {
			System.out.println("성적 입력이 불가능합니다.");
		} else {
			s[cnt] = new Score();
			System.out.print("이름 입력: ");
			s[cnt].setName(sc.next());
			System.out.print("학과 입력: ");
			s[cnt].setMajor(sc.next());
			System.out.print("성적 입력: ");
			s[cnt].setScore(sc.nextInt());
			cnt++;
		}
	}

	public void output(Score[] s) {
		if (cnt == 0) {
			System.out.println("출력할 내용이 없습니다.");
		} else {
			for (int i=0; i<cnt; i++) {
				System.out.println("### " + s[i].getName() + " ###");
				System.out.println("학과: " + s[i].getMajor());
				System.out.println("성적: " + s[i].getScore());
			}
		}
	}

	public void modify(Score[] s) {
		if (cnt == 0) {
			System.out.println("수정할 내용이 없습니다.");
		} else {
			System.out.print("수정할 이름 입력: ");
			String name = sc.next();
			
			for (int i=0; i<cnt; i++) {
				if (name.equals(s[i].getName())) {
					System.out.print("학과 수정: ");
					s[i].setMajor(sc.next());
					System.out.print("성적 수정: ");
					s[i].setScore(sc.nextInt());
					break;
				}
				if (cnt-1 == i) {
					System.out.println("수정할 이름을 찾을 수 없습니다.");
				}
			}
		}
	}

	public void delete(Score[] s) {
		if (cnt == 0) {
			System.out.println("삭제할 내용이 없습니다.");
		} else {
			System.out.print("삭제할 이름 입력: ");
			String name = sc.next();
			
			for (int i=0; i<cnt; i++) {
				if (name.equals(s[i].getName())) {
					System.out.println(name + "님의 정보를 삭제합니다.");
					cnt--;
					for (int j=i; j<cnt; j++) {
						s[j] = s[j+1];
					}
					break;
				}
				if (i == cnt-1) {
					System.out.println("삭제할 이름을 찾을 수 없습니다.");
				}
			}
		}
	}

}

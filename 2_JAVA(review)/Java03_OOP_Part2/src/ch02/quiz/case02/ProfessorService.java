package ch02.quiz.case02;

import java.util.Scanner;

public class ProfessorService {

	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
	public void input(Professor[] p) {
		if (p.length == cnt) {
			System.out.println("인원 추가가 불가능합니다.");
		} else {
			p[cnt] = new Professor();
			System.out.print("교수명 입력: ");
			p[cnt].setName(sc.next());
			System.out.print("학과 입력: ");
			p[cnt].setDepart(sc.next());
			cnt++;
		}
	}

	public void output(Professor[] p) {
		if (cnt == 0) {
			System.out.println("출력할 내용이 없습니다.");
		} else {
			for (int i=0; i<cnt; i++) {
				System.out.println("교수명: " + p[i].getName());
				System.out.println("학과: " + p[i].getDepart());
			}
		}
	}

	public void modify(Professor[] p) {
		if (cnt == 0) {
			System.out.println("수정할 내용이 없습니다.");
		} else {
			System.out.print("수정할 이름 입력: ");
			String name = sc.next();
			
			for (int i=0; i<cnt; i++) {
				if (name.equals(p[i].getName())) {
					System.out.print("학과 수정: ");
					p[i].setDepart(sc.next());
					break;
				}
				if (cnt-1 == i) {
					System.out.println("수정할 이름을 찾을 수 없습니다.");
				}
			}
		}
	}

	public void delete(Professor[] p) {
		if (cnt == 0) {
			System.out.println("삭제할 내용이 없습니다.");
		} else {
			System.out.print("삭제할 이름 입력: ");
			String name = sc.next();
			
			for (int i=0; i<cnt; i++) {
				if (name.equals(p[i].getName())) {
					System.out.println(name + "님의 정보를 삭제합니다.");
					cnt--;
					for (int j=i; j<cnt; j++) {
						p[j] = p[j+1];
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

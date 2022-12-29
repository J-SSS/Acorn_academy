package ch01.ex01.quiz.Quiz11;

import java.util.Scanner;

public class ScoreService {

	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		return sc.nextInt();
	}

	public int input(int cnt, Score[] s) {
		if (cnt == 3) { // 0 1 2
			System.out.println("더 이상 저장할 수 없습니다.");
		} else {
			s[cnt] = new Score();
			System.out.print("이름 입력: ");
			s[cnt].name = sc.next();
			System.out.print("점수 입력: ");
			s[cnt].score = sc.nextInt();
			cnt++;
		}
		return cnt;
	}

	public void output(int cnt, Score[] s) {
		if (cnt == 0) {
			System.out.println("출력할 내용이 없습니다.");
		} else {			
			for (int i=0; i<cnt; i++) {
				System.out.println("이름: " + s[i].name);
				System.out.println("점수: " + s[i].score);
			}
		}
	}

	public void modify(int cnt, Score[] s) {
		if (cnt == 0) {
			System.out.println("저장된 정보가 없습니다.");
		} else {
			System.out.print("수정할 이름 입력: ");
			String name = sc.next();
			
			for (int i=0; i<cnt; i++) { 
				if (name.equals(s[i].name)) {
					System.out.print("점수 입력: ");
					s[i].score = sc.nextInt(); // 수정(재할당)
					break;
				}
				if (i == (cnt-1)) 
					System.out.println("찾으시는 이름이 없습니다.");
			}
		}
	}

	public int delete(int cnt, Score[] s) {
		System.out.print("수정할 이름 입력: ");
		String name = sc.next();
		
		for (int i=0; i<cnt; i++) {
			if (name.equals(s[i].name)) {
				System.out.println(name + "의 점수가 삭제되었습니다.");
				cnt--;
				for (int j=i; j<cnt; j++) {
					s[j] = s[j+1];
				}
				break;
			}
			if (i == (cnt-1)) {
				System.out.println("삭제할 이름이 없습니다.");
			}
		}
		return cnt;
	}
}

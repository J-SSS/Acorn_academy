package ch03.ex01.quiz.Quiz02;
import java.util.Scanner;

public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		int menu = sc.nextInt();		
		return menu;
	}

	public int input(int cnt, Student[] s) {
		if (cnt == 3) { // 0 1 2
			System.out.println("더 이상 저장할 수 없습니다.");
		} else {
			s[cnt] = new Student();
			
			s[cnt].studentId = Student.setId;
			System.out.print("이름 입력: ");
			s[cnt].name = sc.next();
			System.out.print("전공 입력: ");
			s[cnt].major = sc.next();
			cnt++;
			Student.setId();
		}
		return cnt;
	}

	public void output(int cnt, Student[] s) {
		if (cnt == 0) {
			System.out.println("출력할 내용이 없습니다.");
		} else {			
			for (int i=0; i<cnt; i++) {
				System.out.println("### " + s[i].studentId + " ###");
				System.out.println("이름: " + s[i].name);
				System.out.println("전공: " + s[i].major);
			}
		}
	}

	public void modify(int cnt, Student[] s) {
		if (cnt == 0) {
			System.out.println("수정할 데이터가 없습니다.");
		} else {
			System.out.print("수정할 학번 입력: ");
			int stuId = sc.nextInt();
			
			for (int i=0; i<cnt; i++) { 
				if (stuId == s[i].studentId) {
					System.out.print("수정할 이름 입력: ");
					s[i].name = sc.next();  // 수정(재할당)
					System.out.print("수정할 전공 입력: ");
					s[i].major = sc.next(); // 수정(재할당)
					break;
				}
				if (i == (cnt-1)) 
					System.out.println("찾으시는 학번이 없습니다.");
			}
		}
	}

	public int delete(int cnt, Student[] s) {
		if (cnt == 0) {
			System.out.println("삭제할 데이터가 없습니다.");
		} else {
			System.out.print("삭제할 학번 입력: ");
			int stuId = sc.nextInt();
			for (int i=0; i<cnt; i++) {
				if (stuId == s[i].studentId) {
					System.out.println(stuId + "학번님의 정보를 삭제합니다.");
					cnt--;
					for (int j=i; j<cnt; j++) {
						s[j] = s[j+1];
					}
					break;
				}
				if (i == (cnt-1)) 
					System.out.println("삭제할 학번이 없습니다.");
			}
		}
		return cnt;
	}
}

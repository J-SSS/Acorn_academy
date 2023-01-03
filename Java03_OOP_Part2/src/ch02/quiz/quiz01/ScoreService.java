package ch02.quiz.quiz01;

public class ScoreService extends Template {
	
	@Override
	int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택: ");
		return sc.nextInt();
	}

	@Override
	void input(Object[] o) {
		Score[] s = (Score[]) o; // down_casting (상속관계이기 때문에 가능)
		s[cnt] = new Score();
		
		System.out.print("이름 입력: ");
		s[cnt].setName(sc.next());
		System.out.print("국어 점수 입력: ");
		s[cnt].setKor(sc.nextInt());
		System.out.print("영어 점수 입력: ");
		s[cnt].setEng(sc.nextInt());
		System.out.print("수학 점수 입력: ");
		s[cnt].setMath(sc.nextInt());
		
		s[cnt].setSum();
		s[cnt].setAvg();
		
		cnt++;
	}

	@Override
	void output(Object[] o) {
		for (int i=0; i<cnt; i++) {
			Score s = (Score) o[i]; // down_casting
			System.out.println("이름: " + s.getName());
			System.out.println("총점: " + s.getSum());
			System.out.println("평균: " + s.getAvg());
		}
	}

	@Override
	void modify(Object[] o) {
		System.out.print("수정할 이름 입력: ");
		String name = sc.next();
		
		Score[] s = (Score[]) o; // down_casting
		for (int i=0; i<cnt; i++) {
			if (name.equals(s[i].getName())) {
				System.out.print("수정할 국어 점수 입력: ");
				s[i].setKor(sc.nextInt());
				System.out.print("수정할 영어 점수 입력: ");
				s[i].setEng(sc.nextInt());
				System.out.print("수정할 수학 점수 입력: ");
				s[i].setMath(sc.nextInt());
				
				s[i].setSum();
				s[i].setAvg();
				break;
			}
			if (cnt-1 == i) {
				System.out.println("수정할 이름을 찾을 수 없습니다.");
			}
		}
	}

	@Override
	void delete(Object[] o) {
		System.out.print("삭제할 이름 입력: ");
		String name = sc.next();
		
		Score[] s = (Score[]) o; // down_casting
		for (int i=0; i<cnt; i++) {
			if (name.equals(s[i].getName())) {
				System.out.println(name + "님의 정보를 삭제합니다.");
				cnt--;
				for (int j=i; j<cnt; j++) {
					s[j] = s[j+1];
				}
				break;
			}
			if (cnt-1 == i) {
				System.out.println("삭제할 이름을 찾을 수 없습니다.");
			}
		}
		
	}

}

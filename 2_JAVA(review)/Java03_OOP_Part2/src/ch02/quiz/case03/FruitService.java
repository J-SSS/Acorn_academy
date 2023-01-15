package ch02.quiz.case03;

public class FruitService extends Template {

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
		if (cnt == o.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		} else {
			Fruit f = new Fruit();
			System.out.print("과일 이름 입력: ");
			f.setfName(sc.next());
			System.out.print("과일 가격 입력: ");
			f.setPrice(sc.nextInt());
			o[cnt] = f; // up_casting
			cnt++;
		}
	}

	@Override
	void output(Object[] o) {
		Fruit[] f = (Fruit[]) o; // down_casting
		if (cnt == 0) {
			System.out.println("출력할 데이터가 없습니다.");
		} else {
			for (int i=0; i<cnt; i++) {
				System.out.print("과일 이름: " + f[i].getfName());
				System.out.print("과일 가격: " + f[i].getPrice());
			}
		}
	}

	@Override
	void modify(Object[] o) {
		if (cnt == 0) {
			System.out.println("수정할 데이터가 없습니다.");
		} else {
			System.out.print("수정할 과일명 입력: ");
			String fName = sc.next();
			
			Fruit[] f = (Fruit[]) o; // down_casting
			for (int i=0; i<cnt; i++) {
				if(fName.equals(f[i].getfName())) {
					System.out.print("수정할 가격 입력: ");
					f[i].setPrice(sc.nextInt());
					break;
				}
				if (cnt-1 == i) {
					System.out.println("수정할 과일명을 찾을 수 없습니다.");
				}
			}
		}
	}

	@Override
	void delete(Object[] o) {
		if (cnt == 0) {
			System.out.println("삭제할 데이터가 없습니다.");
		} else {
			System.out.print("삭제할 과일명 입력: ");
			String fName = sc.next();
			
			Fruit[] f = (Fruit[]) o; // down_casting
			for (int i=0; i<cnt; i++) {
				if(fName.equals(f[i].getfName())) {
					System.out.println(fName + "님의 가격을 삭제합니다.");
					cnt--;
					for (int j=i; j<cnt; j++) {
						f[j] = f[j+1];
					}
					break;
				}
				if (cnt-1 == i) {
					System.out.println("삭제할 과일명을 찾을 수 없습니다.");
				}
			}
		}
	}

}

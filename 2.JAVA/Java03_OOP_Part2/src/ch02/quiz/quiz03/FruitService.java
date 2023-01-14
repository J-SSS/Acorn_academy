package ch02.quiz.quiz03;

public class FruitService extends Template{

	@Override
	void input(Object[] o) {
		Fruit[] f= (Fruit[]) o;
		System.out.print("과일 이름 입력");
		System.out.print("과일 가격 입력");
		cnt++;
	}

	@Override
	void output(Object[] o) {
		
	}

	@Override
	void modify(Object[] o) {
		
	}

	@Override
	void delete(Object[] o) {
		
	}
	
	int menu() {
		System.out.println("1.입 력");
		System.out.println("2.출 ㄴ력");
		System.out.println("3.수 정");
		System.out.println("4.삭 제");
		System.out.println("0.종 료");
		System.out.print("선택 :");
		int select = sc.nextInt();
		return select;
	}

}

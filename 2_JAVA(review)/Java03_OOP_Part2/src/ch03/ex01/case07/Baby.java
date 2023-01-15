package ch03.ex01.case07;

public abstract class Baby implements Person {

	@Override
	public void eat() {
		System.out.println("아기가 이유식을 먹습니다.");
	}
}

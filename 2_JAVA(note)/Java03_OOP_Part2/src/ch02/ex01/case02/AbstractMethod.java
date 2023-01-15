package ch02.ex01.case02;

public abstract class AbstractMethod { //추상 클래스 : 추상메소드를 포함하는 클래스
	
	//추상메소드 : 메소드의 구현부분인 바디,블록{}이 없는 형태
	//클래스 이름과 메소드 이름 앞에 모두 abstract가 붙어야 함
	
	abstract int getAge();
	abstract void setAge(int num);
}

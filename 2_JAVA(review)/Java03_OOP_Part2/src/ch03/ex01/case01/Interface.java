package ch03.ex01.case01;

public interface Interface {

//	void play() {} // 인터페이스는 일반메소드를 가질 수 없음. 추상메소드만 가짐.
	
	int getAge();  // 추상메소드. public abstract 생략
	void setAge(int num);
}

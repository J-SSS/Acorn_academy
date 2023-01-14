package ch03.ex01.case01;

public interface Interface {

	// void ply() {} //인터페이스는 일반적인 메소드를 가질 수 없음. 추상메소드만 가능.
	
	int getAge(); // 추상메소드, public abstract 생략 어차피 추상밖에 못씀
	void setAge(int num);
}

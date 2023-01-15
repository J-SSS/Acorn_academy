package ch03.ex02.case04;

public interface ConstantField {
	// 상수
	public static final String NATION = "korea";
	int MAX_NUM = 100; // public static final을 컴파일러가 자동으로 붙여줌.
	int MIN_NUM = 0;
	
	// 추상 메소드
	void write();
}

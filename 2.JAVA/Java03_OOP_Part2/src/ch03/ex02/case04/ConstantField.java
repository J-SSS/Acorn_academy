package ch03.ex02.case04;

public interface ConstantField {

	// 상수(변수x)
	
	String NATION = "korea";
	int MAX_NUM = 100;
	public static final int MIN_NUM = 0;
	//인터페이스에서 변수필드를 입력하면 자동으로 상수로 취급해줌
	//public static final로 인식
	
	// 추상메소드
	void write();
}

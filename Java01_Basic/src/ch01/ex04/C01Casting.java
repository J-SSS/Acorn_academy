package ch01.ex04;

public class C01Casting {
	public static void main(String[] args) {
		// 정수 타입의 크기 : byte < short < int < long
		// 자동 타입 변환(promotion) : 작은 타입에서 큰 타입으로 데이터 타입을 변환
		
		byte b = 10;
		short s = b;
		int i = s;
		long l = i;
		
		System.out.println(); //10
		
		//강제 타입 변환(demotion) : 큰 타입에서 작은 타입으로 타입을 명시하여 변환
		l = 200; // 200 -> 200L로 자동 변환(int -> long)
		i = (int) l;
		s = (short) i;
		b = (byte) s;
		
		System.out.println(b); // -56으로 값이 변질됨
	}
}

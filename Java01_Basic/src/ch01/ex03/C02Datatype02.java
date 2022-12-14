package ch01.ex03;

public class C02Datatype02 {

	public static void main(String[] args) {
		// 정수 타입과 정수형 리터럴
		
		byte b = -128;
		short s = 32767;
		
		int i1 = 10;
		int i2 = 0b1010; // 2진수 10
		int i3 = 012;    // 8진수 10
		int i4 = 0xA;    // 16진수 10

		System.out.println(i1);
		System.out.println("10의 2진수" + i2);
		System.out.println("10의 8진수" + i3);
		System.out.println("10의 16진수" + i4);
		
		long l1 = 100; //변수를 long으로 줬기 때문에 자동으로 100L로 인식함
		long l2 = 100L;
		long l3 = 20_000_000_000L; //int의 범위 초과시 L필수

		//실수 타입과 실수형 리터럴
		float f = 3.14F;
		double d1 = 3.14D;
		double d2 = 3.14;
				
		System.out.println(f);
		System.out.println(d1);
				
		
	}

}

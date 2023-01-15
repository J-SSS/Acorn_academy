package ch01.ex03;

public class C01DataType {
	public static void main(String[] args) {
		// 기본 타입(Primitive Type)
		// 정수 타입
		byte b = 0;  // 1byte
		short s = 0; // 2byte
		int i = 0;	 // 4byte
		long l = 0;  // 8byte
		
		// 실수 타입
		float f = 0.0f;  // 4byte
		double d = 0.0d; // 8byte
		double d2 = 0.0;
		
		// 문자 타입
		char c = '가';
		
		// 논리 타입
		boolean b2 = true;
		boolean b3 = false;
		
		// 참조 타입(Reference Type)
		// String 타입
		String myName = "김석영";
		System.out.println(myName);
	}
}

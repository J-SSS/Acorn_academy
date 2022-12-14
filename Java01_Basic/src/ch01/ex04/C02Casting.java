package ch01.ex04;

public class C02Casting {
	public static void main(String[] args) {
		
		int a = 100;
		
		//자동 타입 변환(int -> double)
		double b = a;
		System.out.println("a: " + a); //100
		System.out.println("b: " + b); //100.0
		
		//강제 타입 변환(double -> int)
		a = (int) b;
		System.out.println("a: " + a); //100
		System.out.println("b: " + b); //100.0
		
		// 값 변질
		double c = 1.1234;
		int d = (int) c;
		System.out.println("c: " + c); //1.1234
		System.out.println("d: " + d); //1 값 손실
		
		int num = 10/3; // int나누기 int는 int임
		System.out.println("num: " + num); //3
		
		double num2 = 10/3; // int/int=int로 나온 결과값이 double로 저장됨
		System.out.println("num2: " + num2); //3.0
		
		double num3 = 10.0/3; //  double나누기 int는 double/double로 자동변환
		System.out.println("num3: " + num3); //3.3333333333333335
	}
	}


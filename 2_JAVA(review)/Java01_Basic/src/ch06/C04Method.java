package ch06;

public class C04Method {
	// 멤버변수_필드(속성): 변수상자에 데이터 저장
	int a;
	int b;
	
	// 멤버함수_메소드(기능)
	static void print(String msg) { // 7)
		System.out.println(msg);
	}
	
	static int add(int x, int y) { // 4)
		return x + y;
	}
	
	static double avg(int x, int y) {
		int sum = add(x, y); // 3)
		double result = sum / 2.0; // 5)
		return result;
	}
	
	static void process() {
		double result = avg(100, 20); // 2)
		print("계산결과: " + result); // 6)
	}
	
	public static void main(String[] args) {
		process();  // 1)
	}
}

package ch06;

public class C01Function {

	// 함수의 4가지 유형
	// 1. 반환값 X 매개변수 X
	// 2. 반환값 O 매개변수 X
	// 3. 반환값 X 매개변수 O
	// 4. 반환값 O 매개변수 O
	// [반환타입] [함수명] {실행블록}
	
	//1
	void f1() {}
	//2
	int f2() {return 0;}
	//3
	void f3(int a) {}
	//4
	char f4(int b) {return '0';}
	
	//args는 아무 기능 없는 단어. 바꿔도 무관함.
	public static void main(String[] args) {
		
	}
}

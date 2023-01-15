package ch01.ex03;

public class C04DataType04 {
	public static void main(String[] args) {
		
		char c = 'A';
		System.out.println(c); // A
		
		char c2 = 97;
		System.out.println(c2); // a
		
		char c3 = '한';
		System.out.println(c3); // 한
		
		int i = c3;
		System.out.println(i);  // 54620
		
		char c4 = '國';
		System.out.println(c4); // 國
		
		char c5 = 0xD55C;		
		System.out.println(c5); // 한
		
		int i2 = c5;
		System.out.println(i2); // 54620
		
		int i3 = '한';
		System.out.println(i3); // 54620
	}
}

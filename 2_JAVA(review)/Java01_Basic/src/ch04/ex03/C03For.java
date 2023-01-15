package ch04.ex03;

public class C03For {
	public static void main(String[] args) {
		
		int i=1;
		for (; i<10; i*=2) { // i = i * 2
			System.out.print(i + " ");
		}
		
		System.out.println("\nNumber that came out: " + i);
	}
}

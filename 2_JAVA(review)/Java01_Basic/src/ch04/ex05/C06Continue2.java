package ch04.ex05;

public class C06Continue2 {	
	public static void main(String[] args) {
		
		int i=0;
		
		while (i<5) {
			i++;
			if (i==2) continue;
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int j=1; j<=5; j++) {
			if (j==2) continue;
			System.out.println(j);
		}
	}
}

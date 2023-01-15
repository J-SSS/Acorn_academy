package ch04.ex05;

public class C05Continue {
	public static void main(String[] args) {
		
		int i = 0;
		
		while (i<5) {
			i++;
			if(i==2)continue;
			System.out.println(i);
		}
		
		for (int j=1;j<=5;j++) {
			if(i==2)continue;
			System.out.println(j);
		}
	}
}

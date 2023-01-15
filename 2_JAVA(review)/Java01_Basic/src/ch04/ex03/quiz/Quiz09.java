package ch04.ex03.quiz;

public class Quiz09 {
	public static void main(String[] args) {
		
		int tens = 0;  // 십의 자리
		int units = 0; // 일의 자리
		
		for (int i=1; i<=99; i++) {
			tens = i / 10;
			units = i % 10;
			
			System.out.print(" " + i);
			
			if (tens%3==0 && tens!=0)
				System.out.print("짝");
			if (units%3==0 && units!=0)
				System.out.print("짝");
			if (i%10==0)
				System.out.println();
		}
	}
}

package ch04.ex03;

public class star {
	public static void main(String[] args) {
	
		for(int a = 0 ; a < 5 ; a++) {
			
			for(int b = 13 ; b - a >= 0; b--) { 
				System.out.print(" ");
			}
			for(int c = 5 ; c - a <= 5 ; c++ ) { 
				System.out.print("★ ");
				
			}
			System.out.println();  
			
		} //part1
		
		
	for(int d = 0 ; d < 5; d++) {
		
			for(int e = 0 ; d - e > 0 ; e++ ) {
				System.out.print(" ");
			}
			for(int f = 18 ; f - d >= 5 ; f--) {
				System.out.print("★ ");
			}
	
			System.out.println();
			
		} //part2
		
	
	for(int g = 0 ; g < 4; g++) {
		
		for(int h = 2 ; h - g >= 0; h--) {
			System.out.print(" ");
		}
		for(int i = 5 ; i - g <= 15 ; i++) {
			System.out.print("★ ");
		}

		System.out.println();
		
	} //part3
	for(int d = 0 ; d < 5; d++) {
		
		for(int e = -9 ; d - e > 0 ; e++ ) {
			System.out.print(" ");
		}
		for(int f = 5 ; f - d >= 1 ; f--) {
			System.out.print(" ★");
		}

		System.out.println();
		
	} //part4
	
	
	}
}

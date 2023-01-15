package ch04.ex02.quiz;

public class Quiz04 {
	public static void main(String[] args) {
		
		char cName = '5';
		int cNum = 0;
		
		switch (cName) {
		case 'T': cNum = 10; break;
		case 'J': cNum = 11; break;
		case 'Q': cNum = 12; break;
		case 'K': cNum = 13; break;
		case 'A': cNum = 1; break;
		default: cNum = cName - '0'; // '8' - '0' = 56 - 48 = 8
		}
		
		System.out.printf("%c => %d", cName, cNum);
	}
}

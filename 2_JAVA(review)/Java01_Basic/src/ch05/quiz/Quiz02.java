package ch05.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		
		for (char alpha : alphabets) {
			System.out.println(alpha + ", " + (int)alpha);
		}
	}
}

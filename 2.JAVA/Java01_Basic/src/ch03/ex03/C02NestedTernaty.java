package ch03.ex03;

public class C02NestedTernaty {
	public static void main(String[] args) {
		
		int score = 0;
		char grade = 0;

		grade = (score>=90) ? 'A' : ((score>=80) ? 'B' : 'C') ;
		System.out.println(grade);
	}
}

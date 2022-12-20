package ch04.ex01;

public class C04IfElseif {

		public static void main(String[] args) {
			
			int score = 0;
			char grade = 0;
			
			if (score >= 90) 
				grade = 'A';
			else if (score>=80)
				grade = 'B';
			else if (score>=70)
				grade = 'C';
			else
				grade = 'D';
			
			System.out.println(grade);
			
		}
}

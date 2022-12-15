package ch04.ex01;

public class C02NestedIf {
	public static void main(String[] args) {
		
		int score = 93;
		String grade = "";
		
		if (score >= 90) {
			grade = "A";
			if (score >=98) grade += "+";
			else if (score <94) grade += "-";
		}
		else if (score >= 80) {
			grade = "B";
			if (score >=88) grade += "+";
			else if (score <84) grade += "-";

	}
		else {
		grade = "C";
	
	}
		
		System.out.println(grade);
	}
}

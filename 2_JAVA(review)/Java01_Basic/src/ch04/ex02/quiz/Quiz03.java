package ch04.ex02.quiz;

public class Quiz03 {
	public static void main(String[] args) {
		
		// 월별 계절 구하기
		int month = 13;
		String season = "";
		
		if (3<=month && month<=5)
			season = "봄";
		else if (6<=month && month<=8)
			season = "여름";
		else if (9<=month && month<=11)
			season = "가을";
		else if (month==12 || month==1 || month==2)
			season = "겨울";
		else
			season = "존재하지 않는 달";
		
		System.out.println(month + "월은 " + season + "입니다.");
	}
}

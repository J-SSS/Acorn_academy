package ch02.ex01_print.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		
		int year = 2022;
		int month = 12;
		int day = 13;
		
		System.out.printf("%d년 %d월 %d일", year, month, day);
		System.out.println();
		System.out.printf("%d월 %d일\n", month, day);
		System.out.printf("%d일", day);
	}
}

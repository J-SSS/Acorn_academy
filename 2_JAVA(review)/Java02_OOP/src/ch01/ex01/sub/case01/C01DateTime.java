package ch01.ex01.sub.case01;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01DateTime {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now(); // 현재 날짜
		LocalTime time = LocalTime.now().withNano(0); // 현재 시각
		
		System.out.println(date);
		System.out.println(time);
	}
}

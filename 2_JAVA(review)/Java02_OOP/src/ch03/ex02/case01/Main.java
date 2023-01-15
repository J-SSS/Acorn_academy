package ch03.ex02.case01;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
//		Company c = new Company();
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		
		Calendar calendar = Calendar.getInstance(); // 싱글톤 패턴
	}
}

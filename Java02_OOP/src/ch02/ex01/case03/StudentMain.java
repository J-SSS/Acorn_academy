package ch02.ex01.case03;

public class StudentMain {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "장동일";
		s1.score =100;
		System.out.println(s1); //toString메소드를 이용한 출력
	}
}

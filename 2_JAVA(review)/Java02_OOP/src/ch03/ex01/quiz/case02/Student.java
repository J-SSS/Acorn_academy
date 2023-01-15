package ch03.ex01.quiz.case02;

public class Student {
	
	static int startId = 1001;
	int studentId;
	String name;
	String major;
	
	public Student() {
		studentId = startId;
		startId++;
	}
}

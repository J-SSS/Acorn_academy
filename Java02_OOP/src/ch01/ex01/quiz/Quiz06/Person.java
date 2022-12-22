package ch01.ex01.quiz.Quiz06;

public class Person {
	String name;
	int age;
	
	@Override
	public String toString() {
		return  String.format("이름 : %s, 나이 : %d",name,age)
				;
	}
}

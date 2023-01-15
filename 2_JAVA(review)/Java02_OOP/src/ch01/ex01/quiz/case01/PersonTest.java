package ch01.ex01.quiz.case01;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "Tomy";
		p.age = 30;
		p.height = 170; // int->double(자동타입변환)
		p.weight = 65;
		p.gender = "남성";
		
		p.showPersonInfo();
	}
}

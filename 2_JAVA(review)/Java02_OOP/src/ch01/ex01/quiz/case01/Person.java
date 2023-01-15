package ch01.ex01.quiz.case01;

public class Person {
	// 필드_멤버 변수 - 데이터 저장
	String name;
	int age;
	double height;
	double weight;
	String gender;
	
	// 메소드_멤버 함수 - 기능
	void showPersonInfo() {
		System.out.printf("키가 %.1f이고, 몸무게가 %.1fkg인 %s이 있습니다.\n",
				height, weight, gender);
		System.out.printf("이름은 %s이고, 나이는 %d세입니다.", name, age);
	}
}

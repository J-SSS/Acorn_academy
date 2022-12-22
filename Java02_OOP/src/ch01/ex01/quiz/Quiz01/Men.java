package ch01.ex01.quiz.Quiz01;

public class Men {
	double height;
	double weight;
	String name;
	int age;
	
	void menInfo() {
		System.out.printf("키가 %.1f이고, 몸무게가 %.1fkg인 남성이 있습니다. \n"
				+ "이름은 %s이고, 나이는 %d세입니다.", height, weight, name, age);
	}
}

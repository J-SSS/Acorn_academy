package ch01.ex01.quiz.case05;

public class Dice {
	
	int roll() {
		return (int)(Math.random() * 6) + 1; // 1 ~ 6
	}
}

package ch01.ex01.quiz.Quiz05;

import java.util.Scanner;

public class DIceOut {
	public static void main(String[] args) {
		
		Start s = new Start();
		Dice d = new Dice();
		
		while(true) {
		
		s.start();
		
		switch (s.result) {
		case 1:
			System.out.println(d.dice()); break;
		case 2:
			System.out.println("끝");return;
		default :
			break;}
		}

	}
}

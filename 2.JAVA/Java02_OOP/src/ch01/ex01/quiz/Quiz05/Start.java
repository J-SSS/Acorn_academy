package ch01.ex01.quiz.Quiz05;

import java.util.Scanner;

public class Start {
	int result;
	char select;
	
	int start() {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("주사위를 굴릴까요?(y/n)");
	select = sc.next().charAt(0);
	if (select == 'y' || select == 'Y')
	{result = 1;}
	else if(select == 'n' || select == 'Y')
	{result = 2;}
	else {result =0;}
	return result;
	}

}


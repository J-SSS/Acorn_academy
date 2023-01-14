package ch02.quiz.quiz03;

import java.util.Scanner;

public abstract class Template {
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	abstract void input(Object[] o);
	abstract void output(Object[] o);
	abstract void modify(Object[] o);
	abstract void delete(Object[] o);
}

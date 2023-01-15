package ch01.ex01.quiz.case05;

public class DiceMain {
	public static void main(String[] args) {
		
		Dice dice = new Dice();
		Console console = new Console();
		char isRepeat = 0;
		
		do {
			System.out.println(dice.roll());
			isRepeat = console.inChar("주사위를 굴릴까요(y/n)?");
		} while (isRepeat=='Y' || isRepeat=='y');
		
		System.out.println("끝");
	}
}

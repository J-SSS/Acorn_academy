package ch01.ex02.quiz.case02;

public class SlotMachine {
	
	public Ball hitSlot() {
		Ball ball = new Ball();
		ball.setNum(((int)(Math.random() * 45) + 1)); // 1 ~ 45 
		return ball;
	}
}

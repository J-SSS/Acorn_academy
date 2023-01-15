package ch02.quiz.quiz01;

public class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setSum() {
		this.sum = kor + eng + math;
	}
	public void setAvg() {
		this.avg = sum / 3.0;
	}
}


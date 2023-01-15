package ch03.ex03.quiz.domain;

public class Score {
	// 필드
	private int scoreNo;
	
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	
	private int sum;
	private int average;
	
	// 메소드 - get/set
	public int getScoreNo() {
		return scoreNo;
	}
	public void setScoreNo(int scoreNo) {
		this.scoreNo = scoreNo;
	}
	public int getKoreanScore() {
		return koreanScore;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return String.format("%d\t%d\t%d\t%d\t%d\t%d", 
				scoreNo, koreanScore, englishScore, mathScore, sum, average);
	}
}

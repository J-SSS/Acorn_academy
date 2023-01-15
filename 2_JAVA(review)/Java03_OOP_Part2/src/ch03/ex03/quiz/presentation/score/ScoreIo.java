package ch03.ex03.quiz.presentation.score;

import ch03.ex03.quiz.domain.Score;
import ch03.ex03.quiz.presentation.Console;
import ch03.ex03.quiz.service.score.ScoreService;

public class ScoreIo {

	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) { // DI
		this.scoreService = scoreService;
	}
	
	public void run(int studentCount) {
		Console.showInfo("점수 입력을 시작합니다.");
		
		Score score = null;
		for (int i=0; i<studentCount; i++) {
			Console.showInfo((i+1) + "번째 학생입니다.");
			
			score = new Score();
			score.setScoreNo((i+1));
			score.setKoreanScore(Console.inNumber("국어"));
			score.setEnglishScore(Console.inNumber("영어"));
			score.setMathScore(Console.inNumber("수학"));
			
			scoreService.addScore(score);
		}
		
		Console.showInfo("점수 입력이 끝났습니다.");
		this.printScores();
	}
	
	private void printScores() {
		Score[] scores = scoreService.listScores();
		
		Console.showInfo("번호\t국어\t영어\t수학\t합계\t평균");
		Console.showInfo("------------------------------------------");
		
		for (Score score : scores)
			Console.showInfo(score);
	}
}

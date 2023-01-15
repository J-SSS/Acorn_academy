package ch03.ex03.quiz;

import ch03.ex03.quiz.dao.score.ScoreDao;
import ch03.ex03.quiz.dao.score.ScoreDaoImpl;
import ch03.ex03.quiz.domain.Score;
import ch03.ex03.quiz.presentation.Console;
import ch03.ex03.quiz.presentation.score.ScoreIo;
import ch03.ex03.quiz.service.score.ScoreService;
import ch03.ex03.quiz.service.score.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		
		int studentCount=0; // 학생수
		Score[] scores;
		
		studentCount = Console.inNumber("학생수를 입력하세요");		
		scores = new Score[studentCount];
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.run(studentCount);
		
		Console.showInfo("끝.");
	}
}

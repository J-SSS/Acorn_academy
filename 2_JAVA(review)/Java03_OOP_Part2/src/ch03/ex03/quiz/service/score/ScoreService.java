package ch03.ex03.quiz.service.score;

import ch03.ex03.quiz.domain.Score;

public interface ScoreService {
	
	void addScore(Score score); // 학생 1명의 정보(객체) 입력
	Score[] listScores();		// 점수표(배열) 읽어오는 것
}

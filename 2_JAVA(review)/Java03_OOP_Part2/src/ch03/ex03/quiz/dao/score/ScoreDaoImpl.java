package ch03.ex03.quiz.dao.score;

import ch03.ex03.quiz.domain.Score;

public class ScoreDaoImpl implements ScoreDao {
	// 필드
	private Score[] scores; // 점수표
	private int cursor;		// record의 위치를 가리킴
	
	// 생성자
	public ScoreDaoImpl(Score[] scores) { // 생성자 DI
		this.scores = scores;
	}
	
	@Override
	public void setScore(Score score) {
		this.scores[this.cursor++] = score;
	}

	@Override
	public Score[] getScores() {
		return this.scores;
	}

}

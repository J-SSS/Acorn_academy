package ch03.ex03.quiz.service.score;

import ch03.ex03.quiz.dao.score.ScoreDao;
import ch03.ex03.quiz.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) { // DI
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		this.scoreDao.setScore(score);
	}

	@Override
	public Score[] listScores() {
		Score[] scores = this.scoreDao.getScores();
		
		int sum=0;
		int average=0;
		for (Score score : scores) {
			sum = score.getKoreanScore() + score.getEnglishScore() + score.getMathScore();
			average = sum / 3;
			score.setSum(sum);
			score.setAverage(average);
		}
		return scores;
	}
}

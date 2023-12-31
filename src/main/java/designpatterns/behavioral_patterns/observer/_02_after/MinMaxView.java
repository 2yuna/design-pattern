package designpatterns.behavioral_patterns.observer._02_after;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        List<Integer> scores = scoreRecord.getScores();
        displayScores(scores);
    }

    private void displayScores(List<Integer> scores) {
        int min = Collections.min(scores, null);
        int max = Collections.max(scores, null);
        System.out.println("Min: " + min + ", Max: " + max);
    }
}

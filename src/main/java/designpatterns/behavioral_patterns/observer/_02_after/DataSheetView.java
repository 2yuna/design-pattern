package designpatterns.behavioral_patterns.observer._02_after;

import java.util.List;

public class DataSheetView implements Observer {

    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    @Override
    public void update() {
        List<Integer> scores = scoreRecord.getScores();
        displayScore(scores, viewCount);
    }

    private void displayScore(List<Integer> scores, int viewCount) {
        System.out.println("List of " + viewCount + " entries: ");
        for (int i = 0; i < viewCount && i < scores.size(); i++) {
            System.out.print(scores.get(i) + " ");
        }
        System.out.println();
    }
}

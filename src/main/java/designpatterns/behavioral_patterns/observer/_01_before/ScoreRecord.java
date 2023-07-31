package designpatterns.behavioral_patterns.observer._01_before;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {

    private List<Integer> scores = new ArrayList<>();
    private DataSheetView dataViewSheet;

    public void addScore(int score) {
        scores.add(score);
        dataViewSheet.update();
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setDataViewSheet(DataSheetView dataViewSheet) {
        this.dataViewSheet = dataViewSheet;
    }
}

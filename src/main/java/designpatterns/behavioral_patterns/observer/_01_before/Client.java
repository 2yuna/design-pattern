package designpatterns.behavioral_patterns.observer._01_before;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
        scoreRecord.setDataViewSheet(dataSheetView);

        for (int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}

package designpatterns.behavioral_patterns.command._02_after;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Alarm alarm = new Alarm();

        Button button = new Button(lamp, alarm);
        button.setMode(Mode.ALARM);

        button.pressed();
    }
}

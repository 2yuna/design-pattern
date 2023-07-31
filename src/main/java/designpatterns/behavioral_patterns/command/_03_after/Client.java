package designpatterns.behavioral_patterns.command._03_after;

public class Client {
    public static void main(String[] args) {
        LampOnCommand lampOnCommand = new LampOnCommand(new Lamp());
        Button button = new Button(lampOnCommand);
        button.pressed();

        AlarmStartCommand alarmStartCommand = new AlarmStartCommand(new Alarm());
        button.changeCommand(alarmStartCommand);
        button.pressed();
    }
}

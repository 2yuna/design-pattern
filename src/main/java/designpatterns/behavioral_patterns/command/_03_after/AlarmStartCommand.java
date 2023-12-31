package designpatterns.behavioral_patterns.command._03_after;

public class AlarmStartCommand implements Command {

    private Alarm alarm;

    public AlarmStartCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}

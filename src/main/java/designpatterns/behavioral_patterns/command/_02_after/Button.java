package designpatterns.behavioral_patterns.command._02_after;


public class Button {

    private Lamp lamp;
    private Alarm alarm;
    private Mode mode;

    public Button(Lamp lamp, Alarm alarm) {
        this.lamp = lamp;
        this.alarm = alarm;
    }

    public void pressed() {
        switch (mode) {
            case LAMP -> lamp.turnOn();
            case ALARM -> alarm.start();
        }
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
}
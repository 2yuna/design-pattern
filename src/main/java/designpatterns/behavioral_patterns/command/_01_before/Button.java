package designpatterns.behavioral_patterns.command._01_before;

public class Button {

    private Lamp lamp;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public void pressed() {
        lamp.turnOn();
    }
}

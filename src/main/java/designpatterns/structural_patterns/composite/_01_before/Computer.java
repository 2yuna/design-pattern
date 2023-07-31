package designpatterns.structural_patterns.composite._01_before;

public class Computer {

    private Keyboard keyboard;
    private Body body;
    private Monitor monitor;

    public void addKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void addBody(Body body) {
        this.body = body;
    }

    public void addMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public int getPrice() {
        return keyboard.getPrice() + body.getPrice() + monitor.getPrice();
    }

    public int getPower() {
        return keyboard.getPower() + body.getPower() + monitor.getPower();
    }
}

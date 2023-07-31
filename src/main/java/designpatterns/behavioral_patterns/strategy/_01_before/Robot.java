package designpatterns.behavioral_patterns.strategy._01_before;

public abstract class Robot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void move();

    public String getName() {
        return name;
    }
}

package designpatterns.behavioral_patterns.strategy._02_after.moving;

public class WalkingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}

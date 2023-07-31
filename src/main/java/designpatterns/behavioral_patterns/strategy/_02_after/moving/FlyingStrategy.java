package designpatterns.behavioral_patterns.strategy._02_after.moving;

public class FlyingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("I can fly.");
    }
}

package designpatterns.behavioral_patterns.strategy._02_after.attack;

public class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("I have strong punch.");
    }
}

package designpatterns.behavioral_patterns.strategy._01_before;

public class TaekwonV extends Robot {

    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("I have Missile.");
    }

    @Override
    public void move() {
        System.out.println("I can only walk.");
    }
}

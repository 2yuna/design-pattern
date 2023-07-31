package designpatterns.behavioral_patterns.strategy._02_after;

import designpatterns.behavioral_patterns.strategy._02_after.attack.AttackStrategy;
import designpatterns.behavioral_patterns.strategy._02_after.moving.MovingStrategy;

public abstract class Robot {

    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public Robot(String name) {
        this.name = name;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void move() {
        movingStrategy.move();
    }

    public String getName() {
        return name;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }
}

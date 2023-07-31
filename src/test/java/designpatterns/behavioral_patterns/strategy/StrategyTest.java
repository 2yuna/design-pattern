package designpatterns.behavioral_patterns.strategy;

import designpatterns.behavioral_patterns.strategy._02_after.Atom;
import designpatterns.behavioral_patterns.strategy._02_after.Robot;
import designpatterns.behavioral_patterns.strategy._02_after.TaekwonV;
import designpatterns.behavioral_patterns.strategy._02_after.attack.MissileStrategy;
import designpatterns.behavioral_patterns.strategy._02_after.attack.PunchStrategy;
import designpatterns.behavioral_patterns.strategy._02_after.moving.FlyingStrategy;
import designpatterns.behavioral_patterns.strategy._02_after.moving.WalkingStrategy;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    void createTaekwonV() {
        Robot taekwonV = new TaekwonV("TaekwonV");
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();
    }

    @Test
    void createAtom() {
        Robot atom = new Atom("Atom");
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}

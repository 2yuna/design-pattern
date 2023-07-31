package designpatterns.behavioral_patterns.strategy._02_after;

import designpatterns.behavioral_patterns.strategy._02_after.attack.MissileStrategy;
import designpatterns.behavioral_patterns.strategy._02_after.attack.PunchStrategy;
import designpatterns.behavioral_patterns.strategy._02_after.moving.FlyingStrategy;
import designpatterns.behavioral_patterns.strategy._02_after.moving.WalkingStrategy;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.setAttackStrategy(new MissileStrategy());

        Robot atom = new Atom("Atom");
        atom.setMovingStrategy(new FlyingStrategy());
        atom.setAttackStrategy(new PunchStrategy());

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}

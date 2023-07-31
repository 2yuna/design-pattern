package designpatterns.behavioral_patterns.template._02_after;

public class LGMotor extends Motor {

    public LGMotor(Door door) {
        super(door);
    }

    @Override
    public void moveMotor(Direction direction) {
        // LGMotor를 구동시킴
    }
}

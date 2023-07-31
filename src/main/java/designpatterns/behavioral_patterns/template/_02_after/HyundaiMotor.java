package designpatterns.behavioral_patterns.template._02_after;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    public void moveMotor(Direction direction) {
        // HyundaiMotor를 구동시킴
    }
}
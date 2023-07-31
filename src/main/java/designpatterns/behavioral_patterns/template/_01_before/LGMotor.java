package designpatterns.behavioral_patterns.template._01_before;

public class LGMotor {

    private Door door;

    private MotorStatus motorStatus;

    public LGMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public void move(Direction direction) {
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        moveLGMotor(direction);
        motorStatus = MotorStatus.MOVING;
    }

    private void moveLGMotor(Direction direction) {
        // LGMotor를 구동시킴
    }
}
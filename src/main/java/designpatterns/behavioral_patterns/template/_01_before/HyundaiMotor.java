package designpatterns.behavioral_patterns.template._01_before;

public class HyundaiMotor {

    private Door door;

    private MotorStatus motorStatus;

    public HyundaiMotor(Door door) {
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

        moveHyundaiMotor(direction);
        motorStatus = MotorStatus.MOVING;
    }

    private void moveHyundaiMotor(Direction direction) {
        // HyundaiMotor를 구동시킴
    }
}
package designpatterns.behavioral_patterns.template._03_after;

import designpatterns.behavioral_patterns.template._01_before.MotorStatus;

public abstract class Motor {

    protected Door door;

    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        if (motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if (doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    public abstract void moveMotor(Direction direction);

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}

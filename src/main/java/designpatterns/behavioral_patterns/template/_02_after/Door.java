package designpatterns.behavioral_patterns.template._02_after;

public class Door {

    private DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public void close() {
        doorStatus = DoorStatus.CLOSED;
    }

    public void open() {
        doorStatus = DoorStatus.OPENED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }
}

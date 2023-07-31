package designpatterns.behavioral_patterns.template._01_before;

public class Client {
    public static void main(String[] args) {
        HyundaiMotor hyundaiMotor = new HyundaiMotor(new Door());
        hyundaiMotor.move(Direction.UP);
    }
}

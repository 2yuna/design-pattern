package designpatterns.structural_patterns.composite._02_after;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(2, 5);
        Body body = new Body(70, 100);
        Monitor monitor = new Monitor(30, 20);
        Speaker speaker = new Speaker(20, 10);

        Computer computer = new Computer();
        computer.addComponent(keyboard);
        computer.addComponent(body);
        computer.addComponent(monitor);
        computer.addComponent(speaker);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();
        System.out.println("Computer Price: " + computerPrice + "만원");
        System.out.println("Computer Power: " + computerPower + "W");
    }
}

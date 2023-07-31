package designpatterns.structural_patterns.composite._01_before;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(2, 5);
        Body body = new Body(70, 100);
        Monitor monitor = new Monitor(30, 20);

        Computer computer = new Computer();
        computer.addKeyboard(keyboard);
        computer.addBody(body);
        computer.addMonitor(monitor);

        int computerPrice = computer.getPrice();
        int computerPower = computer.getPower();
        System.out.println("Computer Price: " + computerPrice + "만원");
        System.out.println("Computer Power: " + computerPower + "W");
    }
}

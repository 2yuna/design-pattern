package designpatterns.structural_patterns.composite._02_after;

public class Keyboard implements ComputerDevice {

    private int price;
    private int power;

    public Keyboard(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}

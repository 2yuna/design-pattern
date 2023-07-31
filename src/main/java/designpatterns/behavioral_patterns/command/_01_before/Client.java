package designpatterns.behavioral_patterns.command._01_before;

public class Client {
    public static void main(String[] args) {
        Button button = new Button(new Lamp());
        button.pressed();
    }
}

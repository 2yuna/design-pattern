package designpatterns.behavioral_patterns.strategy._01_before;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        System.out.println("My name is " + taekwonV.getName());
        taekwonV.attack();
        taekwonV.move();

        Robot atom = new Atom("Atom");
        System.out.println("My name is " + atom.getName());
        atom.attack();
        atom.move();
    }
}

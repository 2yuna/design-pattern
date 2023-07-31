package designpattern.decorator.decorator;

import designpattern.decorator.Display;

public abstract class DisplayDecorator extends Display {

    private Display decoratedDisplay;

    public DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}
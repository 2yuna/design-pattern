package designpatterns.structural_patterns.decorator.decorator;

import designpatterns.structural_patterns.decorator.Display;

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
package designpatterns.structural_patterns.decorator.decorator;

import designpatterns.structural_patterns.decorator.Display;

public class LaneDecorator extends DisplayDecorator {

    public LaneDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("\t차선 표시");
    }
}

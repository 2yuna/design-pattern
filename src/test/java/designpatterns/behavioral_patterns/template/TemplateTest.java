package designpatterns.behavioral_patterns.template;

import designpatterns.behavioral_patterns.template._02_after.*;
import org.junit.jupiter.api.Test;

public class TemplateTest {

    @Test
    void moveHyundaiMotor() {
        Motor hyundaiMotor = new HyundaiMotor(new Door());
        hyundaiMotor.moveMotor(Direction.UP);
    }

    @Test
    void moveLGMotor() {
        Motor lgMotor = new LGMotor(new Door());
        lgMotor.moveMotor(Direction.UP);
    }
}

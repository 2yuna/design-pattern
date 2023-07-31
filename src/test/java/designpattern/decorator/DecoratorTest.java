package designpattern.decorator;

import designpattern.decorator.decorator.LaneDecorator;
import designpattern.decorator.decorator.TrafficDecorator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @DisplayName("기본 도로 표시")
    @Test
    void drawRoadDisplay() {
        Display road = new RoadDisplay();
        road.draw();
    }

    @DisplayName("기본 도로 + 차선 표시")
    @Test
    void drawRoadAndLaneDisplay() {
        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();
    }

    @DisplayName("기본 도로 + 교통량 표시")
    @Test
    void drawRoadAndTrafficDisplay() {
        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();
    }

    @DisplayName("기본 도로 + 차선 + 교통량 표시")
    @Test
    void drawRoadLaneAndTrafficDisplay() {
        Display roadWithLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));
        roadWithLaneAndTraffic.draw();
    }
}
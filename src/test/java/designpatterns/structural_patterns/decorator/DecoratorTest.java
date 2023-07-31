package designpatterns.structural_patterns.decorator;

import designpatterns.structural_patterns.decorator.decorator.CrossingDecorator;
import designpatterns.structural_patterns.decorator.decorator.LaneDecorator;
import designpatterns.structural_patterns.decorator.decorator.TrafficDecorator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @DisplayName("기본 도로 표시")
    @Test
    void drawRoad() {
        Display road = new RoadDisplay();
        road.draw();
    }

    @DisplayName("기본 도로, 차선 표시")
    @Test
    void drawRoadWithLane() {
        Display roadWithLane = new LaneDecorator(new RoadDisplay());
        roadWithLane.draw();
    }

    @DisplayName("기본 도로, 교통량 표시")
    @Test
    void drawRoadWithTraffic() {
        Display roadWithTraffic = new TrafficDecorator(new RoadDisplay());
        roadWithTraffic.draw();
    }

    @DisplayName("기본 도로, 차선, 교통량 표시")
    @Test
    void drawRoadWithLaneAndTraffic() {
        Display roadWithLaneAndTraffic = new LaneDecorator(new TrafficDecorator(new RoadDisplay()));
        roadWithLaneAndTraffic.draw();
    }

    @DisplayName("기본 도로, 차선, 교통량, 교차로 표시")
    @Test
    void drawRoadWithCrossingLaneAndTraffic() {
        Display roadWithCrossingLaneAndTraffic = new CrossingDecorator(new LaneDecorator(new TrafficDecorator(
                new RoadDisplay())));
        roadWithCrossingLaneAndTraffic.draw();
    }
}
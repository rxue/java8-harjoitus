package rx.practice.advanced.designpatterns.structural.object.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class State {
    private Position position;
    private Direction direction;
}

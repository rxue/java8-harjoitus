package rx.practice.advanced.designprinciples.solid;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class State {
    private Position position;
    private Direction direction;

}

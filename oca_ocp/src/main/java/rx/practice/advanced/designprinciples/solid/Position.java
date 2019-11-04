package rx.practice.advanced.designprinciples.solid;

import lombok.Getter;
import lombok.Value;

@Getter
@Value
public final class Position {
    private int x;
    private int y;
}

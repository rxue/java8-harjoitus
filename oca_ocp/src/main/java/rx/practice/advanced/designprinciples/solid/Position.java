package rx.practice.advanced.designprinciples.solid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@Getter
@Value
@AllArgsConstructor
public final class Position {
    private int x;
    private int y;
}

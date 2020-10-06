package rx.practice.advanced.designpatterns.structural.object.composite;

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

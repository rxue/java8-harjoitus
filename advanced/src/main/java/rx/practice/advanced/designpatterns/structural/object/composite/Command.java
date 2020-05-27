package rx.practice.advanced.designpatterns.structural.object.composite;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Value;

@AllArgsConstructor
@EqualsAndHashCode
@Value
public class Command implements IComponentKey {
    private char cmd;
}

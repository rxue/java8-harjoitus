package rx.practice.advanced.designprinciples.solid;

import java.util.Map;
import java.util.Optional;

@FunctionalInterface
public interface IProcessorComponent {
    default Map<IComponentKey,IProcessorComponent> getChildComponentMap() {
        throw new UnsupportedOperationException();
    }
    default IProcessorComponent getChild(IComponentKey argument) {
        return getChildComponentMap().get(argument);
    }
    State move(State originalState);
}

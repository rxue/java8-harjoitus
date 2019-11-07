package rx.practice.advanced.designpatterns.structural.object.composite;

import java.util.Map;

@FunctionalInterface
public interface IProcessorComponent {
    default Map<IComponentKey,IProcessorComponent> getChildComponentMap() {
        throw new UnsupportedOperationException();
    }
    default IProcessorComponent getChild(IComponentKey argument) {
        throw new UnsupportedOperationException();
    }
    State move(State originalState);
}

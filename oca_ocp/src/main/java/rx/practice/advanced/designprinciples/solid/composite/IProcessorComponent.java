package rx.practice.advanced.designprinciples.solid.composite;

import rx.practice.advanced.designprinciples.solid.IComponentKey;
import rx.practice.advanced.designprinciples.solid.State;

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

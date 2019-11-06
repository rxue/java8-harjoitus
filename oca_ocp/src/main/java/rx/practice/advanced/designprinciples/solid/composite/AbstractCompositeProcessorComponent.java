package rx.practice.advanced.designprinciples.solid.composite;

import rx.practice.advanced.designprinciples.solid.IComponentKey;
import rx.practice.advanced.designprinciples.solid.State;

public abstract class AbstractCompositeProcessorComponent implements IProcessorComponent {
    @Override
    public IProcessorComponent getChild(IComponentKey argument) {
        return getChildComponentMap().get(argument);
    }
    @Override
    public State move(State originalState) {
        throw new UnsupportedOperationException("Composite component does not have operation");
    }
}

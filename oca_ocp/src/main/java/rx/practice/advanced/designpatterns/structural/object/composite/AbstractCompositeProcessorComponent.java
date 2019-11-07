package rx.practice.advanced.designpatterns.structural.object.composite;

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

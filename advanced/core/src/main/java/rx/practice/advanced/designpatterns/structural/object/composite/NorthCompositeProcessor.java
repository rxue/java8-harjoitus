package rx.practice.advanced.designpatterns.structural.object.composite;

import java.util.HashMap;
import java.util.Map;

public class NorthCompositeProcessor extends AbstractCompositeProcessorComponent {
    @Override
    public Map<IComponentKey,IProcessorComponent> getChildComponentMap() {
        Map<IComponentKey, IProcessorComponent> processorMap = new HashMap<>();
        processorMap.put(new Command('l'), state -> new State(state.getPosition(), Direction.WEST));
        return processorMap;
    }
}



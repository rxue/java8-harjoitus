package rx.practice.advanced.designpatterns.structural.object.composite;

import java.util.HashMap;
import java.util.Map;

public class RootProcessor extends AbstractCompositeProcessorComponent {
    @Override
    public Map<IComponentKey, IProcessorComponent> getChildComponentMap() {
        Map<IComponentKey,IProcessorComponent> processorsMap = new HashMap<>();
        processorsMap.put(Direction.EAST, new EastCompositeProcessor());
        processorsMap.put(Direction.NORTH, new NorthCompositeProcessor());
        return processorsMap;
    }
}

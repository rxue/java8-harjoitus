package rx.practice.advanced.designprinciples.solid.composite;

import rx.practice.advanced.designprinciples.solid.Direction;
import rx.practice.advanced.designprinciples.solid.IComponentKey;

import java.util.HashMap;
import java.util.Map;

public class RootProcessor extends AbstractCompositeProcessorComponent {
    @Override
    public Map<IComponentKey, IProcessorComponent> getChildComponentMap() {
        Map<IComponentKey,IProcessorComponent> processorsMap = new HashMap<>();
        processorsMap.put(Direction.EAST, new EastCompositeProcessor());
        return processorsMap;
    }
}

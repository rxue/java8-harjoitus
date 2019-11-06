package rx.practice.advanced.designprinciples.solid;

import java.util.HashMap;
import java.util.Map;

public class RootProcessor implements IProcessorComponent {
    @Override
    public Map<IComponentKey,IProcessorComponent> getChildComponentMap() {
        Map<IComponentKey,IProcessorComponent> processorsMap = new HashMap<>();
        processorsMap.put(Direction.EAST, new EastCompositeProcessor());
        return processorsMap;
    }

    @Override
    public State move(State originalState) {
        throw new UnsupportedOperationException();
    }
}

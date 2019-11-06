package rx.practice.advanced.designprinciples.solid.composite;

import rx.practice.advanced.designprinciples.solid.*;

import java.util.HashMap;
import java.util.Map;

public class EastCompositeProcessor extends AbstractCompositeProcessorComponent {
    @Override
    public Map<IComponentKey,IProcessorComponent> getChildComponentMap() {
        Map<IComponentKey, IProcessorComponent> processorMap = new HashMap<>();
        processorMap.put(new Command('f'), state -> {
            Position currentPosition = state.getPosition();
            Position newPosition = new Position(currentPosition.getX() + 1, currentPosition.getY());
            return new State(newPosition, state.getDirection());
        });
        processorMap.put(new Command('l'), state -> new State(state.getPosition(), Direction.NORTH));
        return processorMap;
    }
}



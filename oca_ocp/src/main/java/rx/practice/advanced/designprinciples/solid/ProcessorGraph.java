package rx.practice.advanced.designprinciples.solid;

import java.util.HashMap;
import java.util.Map;

public class ProcessorGraph {
    private Map<Direction, Map<Character,IProcessor>> processorGraph;
    public ProcessorGraph() {
        processorGraph = new HashMap<>();
        processorGraph.put(Direction.EAST, getEastProcessorMap());

    }
    private Map<Character,IProcessor> getEastProcessorMap() {
        Map<Character,IProcessor> map = new HashMap<>();
        map.put(new Character('f'), EastProcessors.EAST_FORWARD_PROCESSOR);
        return map;
    }
    public IProcessor getProcessor(Direction direction, char command) {
        return processorGraph.get(direction).get(command);
    }
}

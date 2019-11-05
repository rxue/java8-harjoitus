package rx.practice.advanced.designprinciples.solid;

import lombok.Getter;

public class Rover {
    @Getter
    private State state;
    private ProcessorGraph processorGraph;
    public Rover(State state) {
        this.state = state;
        processorGraph = new ProcessorGraph();
    }
    public void move(char[] commands) {
        for (char command : commands)
            state = processorGraph
                    .getProcessor(state.getDirection(), command)
                    .move(state);
    }
}

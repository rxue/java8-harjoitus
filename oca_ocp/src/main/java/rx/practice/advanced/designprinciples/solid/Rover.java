package rx.practice.advanced.designprinciples.solid;

import lombok.Getter;

public class Rover {
    @Getter
    private State state;
    private IProcessorComponent rootProcessor;
    public Rover(State state) {
        this.state = state;
        rootProcessor = new RootProcessor();
    }
    public void move(char[] commands) {
        for (char c : commands)
            state = rootProcessor
                    .getChild(state.getDirection())
                    .getChild(new Command(c))
                    .move(state);
    }
}

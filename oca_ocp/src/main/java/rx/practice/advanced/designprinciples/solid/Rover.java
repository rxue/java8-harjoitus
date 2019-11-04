package rx.practice.advanced.designprinciples.solid;

import lombok.Getter;

import java.util.Map;

public class Rover {
    @Getter
    private State state;
    private Map<Character,IProcessor> processorMapper;
    public Rover(State state) {
        this.state = state;
    }
    public void move(char[] command) {
        //state = processorMapper.get(command).process(state);
    }
}

package rx.practice.advanced.designprinciples.solid;
@FunctionalInterface
public interface IProcessor {
    State process(State originalState);
}

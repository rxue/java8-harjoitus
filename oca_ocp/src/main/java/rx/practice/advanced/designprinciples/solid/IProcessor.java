package rx.practice.advanced.designprinciples.solid;
@FunctionalInterface
public interface IProcessor {
    State move(State originalState);
}

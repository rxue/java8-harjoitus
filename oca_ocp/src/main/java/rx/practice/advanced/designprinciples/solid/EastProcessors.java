package rx.practice.advanced.designprinciples.solid;

final class EastProcessors {
    private EastProcessors() {}
    public static final IProcessor EAST_FORWARD_PROCESSOR = state -> {
        Position currentPosition = state.getPosition();
        Position newPosition = new Position(currentPosition.getX() + 1, currentPosition.getY());
        return new State(newPosition, state.getDirection());
    };
}

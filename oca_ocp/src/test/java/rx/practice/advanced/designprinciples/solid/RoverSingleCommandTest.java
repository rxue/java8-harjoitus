package rx.practice.advanced.designprinciples.solid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverSingleCommandTest {
    @Test
    public void testEastMoveForward() {
        Position origin = new Position(0,0);
        Direction direction = Direction.EAST;
        State state = new State(origin, direction);
        Rover rover = new Rover(state);
        rover.move("f".toCharArray());
        State movedToState = rover.getState();
        assertEquals(direction, movedToState.getDirection());
        assertEquals(new Position(1, 0), movedToState.getPosition());
    }

    @Test
    public void testEastMoveLeft() {
        Position origin = new Position(0,0);
        Direction direction = Direction.EAST;
        State state = new State(origin, direction);
        Rover rover = new Rover(state);
        rover.move("l".toCharArray());
        State movedToState = rover.getState();
        assertEquals(Direction.NORTH, movedToState.getDirection());
        assertEquals(new Position(0, 0), movedToState.getPosition());
    }
}

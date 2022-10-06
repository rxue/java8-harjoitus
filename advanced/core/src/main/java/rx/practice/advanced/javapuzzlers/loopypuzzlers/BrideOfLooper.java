package rx.practice.advanced.javapuzzlers.loopypuzzlers;

/**
 * Puzzle 29: Bride of Looper
 * Provide a declaration of i that turns this loop into an infinite loop
 *
 */
public class BrideOfLooper {
    public static void main(String[] args) {
        double i = Double.NaN;
        while (i != i) {}
    }
}

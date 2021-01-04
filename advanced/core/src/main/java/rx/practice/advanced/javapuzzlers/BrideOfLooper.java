package rx.practice.advanced.javapuzzlers;

/**
 * Puzzle 29: Bride of Looper
 * Provide a declaration of i that turns this loop into an infinite loop
 *
 */
public class BrideOfLooper {
    public static void main(String[] args) {
        double i = 0.0d/0.0;
        while (i != i) {};
    }
}

package rx.practice.advanced.javapuzzlers.expressivepuzzlers;

/**
 * Puzzle 3: Long Division
 *
 * This puzzle is called Long Division because it concerns a program that divides
 * two long values. The dividend represents the number of microseconds in a day;
 * the divisor, the number of milliseconds in a day. What does the program print?
 *
 */
public class LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}

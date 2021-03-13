package rx.practice.advanced.benchmarking;

import java.util.List;

public class Parser {
    private Parser() {}
    static boolean canParseDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}

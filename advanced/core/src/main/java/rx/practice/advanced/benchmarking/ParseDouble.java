package rx.practice.advanced.benchmarking;

import java.util.List;

public class ParseDouble implements BenchMarkingRunner<String> {
    private final List<String> elements;
    public ParseDouble(List<String> elements) {
        this.elements = elements;
    }

    static boolean canParseDouble(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    @Override
    public long total() {
        long startTime = BenchMarkingRunner.getTimeStamp();
        elements.forEach(ParseDouble::canParseDouble);
        return BenchMarkingRunner.getTimeStamp() - startTime;
    }
}

package rx.practice.advanced.benchmarking;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class NumberUtilsParser implements BenchMarkingRunner<String> {
    private final List<String> elements;

    public NumberUtilsParser(List<String> elements) {
        this.elements = elements;
    }

    @Override
    public long total() {
        long startTime = BenchMarkingRunner.getTimeStamp();
        elements.forEach(NumberUtils::isCreatable);
        return BenchMarkingRunner.getTimeStamp() - startTime;
    }
}

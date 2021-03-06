package rx.practice.advanced.benchmarking;

import org.apache.commons.lang3.math.NumberUtils;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;
@State(Scope.Benchmark)
public class BenchmarkIsCreatable {
    @Param({"x","1", "1a"})
    String input;

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value=1)
    @Warmup(iterations=0)
    @Measurement(iterations=1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public boolean init() {
        return NumberUtils.isCreatable(input);
    }
}

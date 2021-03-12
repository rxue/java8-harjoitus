package rx.practice.advanced.benchmarking;

import org.apache.commons.lang3.math.NumberUtils;
import org.openjdk.jmh.annotations.*;

public class BenchmarkIsCreatable {
    //@State({"x","y","z"})
    //String input;

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value=1)
    @Warmup(iterations=2)
    @Measurement(iterations=1)
    public void init() {
        NumberUtils.isCreatable("x");
    }
}

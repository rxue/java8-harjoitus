package rx.practice.advanced.benchmarking.inputstream;

import org.openjdk.jmh.annotations.*;

import java.io.*;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class BufferedInputStreamBenchmarker {
    @Param({"/home/rui/Downloads/PeakyBlinders.zip /home/rui/Downloads/PeakyBlinders2.zip"})
    String input;

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value=1)
    @Warmup(iterations=0)
    @Measurement(iterations=1)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void init() {
        String[] inputs = input.split(" ");
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(inputs[0]));
            BufferedOutputStream bufferedOS = new BufferedOutputStream(new FileOutputStream(inputs[1]))) {
            int availableSize = 0;
            final int max = 1073741824 + 1073741824/2;
            while ((availableSize = bufferedInputStream.available())>0) {
                //System.out.println("available buffer length " + availableSize);
                int buffSize = max >= availableSize ? availableSize : max;
                //System.out.println("Buffer size " + buffSize);
                byte[] data = new byte[buffSize];
                bufferedInputStream.read(data);
                bufferedOS.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package rx.practice.advanced.benchmarking;

interface BenchMarkingRunner<T> {
    long total();
    static long getTimeStamp() {
        return System.nanoTime();
    }
}

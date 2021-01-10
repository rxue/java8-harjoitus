package rx.practice.advanced.learningtests.util.concurrent;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;
import java.util.function.Function;
@Tag("SLOW")
public class CompletableFutureThenComposeTest {
    @Test
    public void testThenCompose() throws InterruptedException {
        BlockingQueue<String> producedResults = new LinkedBlockingQueue<>();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        Function<Void, CompletionStage<Void>> combineFunction = v -> {
            System.out.println("COMBINE");
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + " going to sleep! ");
                Thread.sleep(1000*5);
                System.out.println("Thread " + Thread.currentThread().getId() + " woke up! ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;};
        CompletableFuture.runAsync(initRunnableDouble(3, producedResults, "First"), executor)
                .thenRunAsync(initRunnableDouble(4, producedResults, "Second"), executor)
                .thenComposeAsync(combineFunction, executor);
        Thread.sleep(1000*12);
        System.out.println("End in main thread" + Thread.currentThread().getId());
    }
    private Runnable initRunnableDouble(long sleepTimeInSeconds, BlockingQueue<String> messageQueue, String message) {
        return () -> {
            try {
                Thread.sleep(1000*sleepTimeInSeconds);
                System.out.println("Thread " + Thread.currentThread().getId() + " woke up! " + message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            messageQueue.offer(message);
        };
    }
}

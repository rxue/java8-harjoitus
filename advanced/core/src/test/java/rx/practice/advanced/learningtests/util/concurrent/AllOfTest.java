package rx.practice.advanced.learningtests.util.concurrent;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Tag("SLOW")
public class AllOfTest {
    @Test
    public void testWait() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        BlockingQueue<String> messageQueue = new LinkedBlockingQueue<>();
        String first = "FIRST";
        String second = "SECOND";
        String third = "THIRD";
        CompletableFuture firstTaskFuture = CompletableFuture.runAsync(initTask(5, messageQueue, first), executor);
        CompletableFuture secondTaskFuture = CompletableFuture.runAsync(initTask(2, messageQueue, second), executor);
        CompletableFuture thirdTaskFuture = CompletableFuture.runAsync(initTask(1, messageQueue, third), executor);
        System.out.println("main thread: " + Thread.currentThread().getId());
        CompletableFuture.allOf(firstTaskFuture, secondTaskFuture, thirdTaskFuture)
                .thenRun(() -> {
                    System.out.println("run assert in thread: " + Thread.currentThread().getId());
                });
        Thread.sleep(1000*10);
    }

    private Runnable initTask(long sleepTimeInSeconds, BlockingQueue<String> messageQueue, String message) {
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

package rx.practice.advanced.learningtests.util.concurrent;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@Tag("SLOW")
public class ThenRunAsyncTest {
    @Test
    public void testThenRunAsyncFollowedByAllOf() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 50; i++) {
            BlockingDeque<String> messageQueue = new LinkedBlockingDeque<>();
            String first = "FIRST";
            String second = "SECOND";
            String third = "THIRD";
            CompletableFuture firstTaskFuture = CompletableFuture.runAsync(initTask(5, messageQueue, first), executor);
            CompletableFuture secondTaskFuture = CompletableFuture.runAsync(initTask(2, messageQueue, second), executor);
            CompletableFuture thirdTaskFuture = CompletableFuture.runAsync(initTask(1, messageQueue, third), executor);
            System.out.println("main thread: " + Thread.currentThread().getId());
            String last = "LAST";
            CompletableFuture.allOf(firstTaskFuture, secondTaskFuture, thirdTaskFuture)
                    .thenRunAsync(initTask(1, messageQueue, last), executor)
                    .get();
            assertSame(4, messageQueue.size());
            assertEquals(messageQueue.pollLast(), last);
        }
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

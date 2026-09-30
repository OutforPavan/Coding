package com.coding.leetcode.coding.Omnissa.concurrency;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.time.Duration;

/**
 * T01 (P0): Observe run versus start and a thread's lifecycle with safe gates.
 *
 * <p>Invoke one Runnable directly and another through Thread.start. Record whether
 * each executes on the caller thread, using thread identity rather than a guessed
 * thread name. Capture NEW before start and TERMINATED after a successful bounded
 * join. Use latches to control progress. Explain processes versus threads and
 * concurrency versus parallelism; one does not guarantee the other.
 *
 * <p>Discuss RUNNABLE, BLOCKED, WAITING and TIMED_WAITING without asserting an
 * exact transient state from a race-prone snapshot. Starting a Thread twice must
 * be recognized as invalid. All waits/joins use the supplied overall deadline;
 * interrupt and join remaining workers in finally. No sleeps to establish order.
 */
public final class ThreadLifecycleFoundations {
    public record Report(boolean directRunUsedCaller, boolean startUsedDifferentThread,
                         Thread.State beforeStart, Thread.State afterJoin) { }

    public static Report solution(Duration timeout) throws InterruptedException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        ExampleRunner.run("T01 Thread lifecycle and execution identity",
                "one direct Runnable.run; one Thread.start; deadline=2 seconds",
                "directRunUsedCaller=true, startUsedDifferentThread=true, beforeStart=NEW, afterJoin=TERMINATED",
                () -> solution(Duration.ofSeconds(2)));
    }
}

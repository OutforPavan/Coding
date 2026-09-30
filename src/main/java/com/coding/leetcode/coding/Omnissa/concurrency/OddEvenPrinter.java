package com.coding.leetcode.coding.Omnissa.concurrency;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.time.Duration;
import java.util.List;

/**
 * C01 (P0): Print odd/even numbers in order using exactly two worker threads.
 * Maps T05 (P0), monitor coordination, and T06 (P0), waiting mechanisms.
 *
 * <p>Return the emitted values rather than relying on interleaved console output.
 * The odd worker emits odd values and the even worker emits even values, covering
 * 1 through limit inclusively. An empty range returns an empty list. Exercise
 * both worker-start orders. Use a shared predicate, condition checks in a loop,
 * and a coordinated hand-off; do not use sleep-based ordering or busy waiting.
 * Explain monitor ownership, notify versus notifyAll, missed signals, spurious
 * wakeups, and which of wait/sleep/join/Condition.await releases a held lock.
 *
 * <p>All waits and joins must share a finite deadline. On interruption or timeout,
 * stop and interrupt the peer, release locks, and join both workers before exit.
 * Never leave a background thread running after an example finishes.
 */
public final class OddEvenPrinter {
    public static List<Integer> solution(int limit, boolean startEvenFirst,
                                         Duration timeout) throws InterruptedException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        ExampleRunner.run("C01/T05/T06 Odd/even coordination",
                "limit=7, startEvenFirst=true, timeout=2 seconds",
                "[1, 2, 3, 4, 5, 6, 7]; both workers terminated",
                () -> solution(7, true, Duration.ofSeconds(2)));
        ExampleRunner.run("C01 Empty range", "limit=0, startEvenFirst=false",
                "[]; no surviving workers",
                () -> solution(0, false, Duration.ofSeconds(2)));
    }
}

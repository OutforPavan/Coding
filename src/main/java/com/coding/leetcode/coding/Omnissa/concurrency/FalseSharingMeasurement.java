package com.coding.leetcode.coding.Omnissa.concurrency;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.time.Duration;

/**
 * T26 (P2), advanced breadth, exercise 3: observe false-sharing measurement limits.
 *
 * <p>Two workers each update their own counter for a bounded number of iterations.
 * Compare a compact-field layout and an explicitly separated/padded candidate.
 * Each worker owns its counter; do not accidentally introduce a shared increment
 * race. Verify both final totals before discussing elapsed-time measurements.
 * Use System.nanoTime for elapsed time and gate starts without sleeps.
 *
 * <p>No fixed speedup, field alignment or measured time is guaranteed by Java or
 * this toy experiment. JVM layout, JIT, warmup, scheduling and hardware affect
 * results. Report raw nonnegative durations; a proper benchmark requires a
 * controlled methodology, not an assertion that one layout is always faster.
 * No external benchmark dependency is needed for this scaffold.
 *
 * <p>Keep allocation and iteration counts small; never create an OOM demo. Bound
 * all coordination/joins by a deadline and interrupt/join workers in finally.
 */
public final class FalseSharingMeasurement {
    public record Measurement(long compactTotal, long separatedTotal,
                              long compactElapsedNanos, long separatedElapsedNanos,
                              boolean allWorkersTerminated) { }

    public static Measurement solution(int iterationsPerWorker, Duration timeout)
            throws InterruptedException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        ExampleRunner.run("T26 False-sharing measurement exercise",
                "2 workers, each performs 10000 increments in each layout; deadline=2 seconds",
                "compactTotal=20000, separatedTotal=20000, both elapsedNanos>=0, allWorkersTerminated=true; no fixed speed ratio",
                () -> solution(10_000, Duration.ofSeconds(2)));
    }
}

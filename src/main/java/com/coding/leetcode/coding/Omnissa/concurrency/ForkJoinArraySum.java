package com.coding.leetcode.coding.Omnissa.concurrency;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.time.Duration;

/**
 * T26 (P2), advanced breadth, exercise 1: fork/join decomposition and work stealing.
 *
 * <p>Sum an int array into a long using recursive, disjoint index ranges and an
 * explicit positive sequential threshold. Each element is counted once; empty
 * input sums to zero. Do not modify the input. Compare the result against an
 * independently computed sequential sum. Explain task-size overhead and why
 * blocking I/O is a poor fit for this CPU-oriented exercise.
 *
 * <p>Use a small owned ForkJoinPool, a finite completion deadline, cooperative
 * cancellation for abandoned work, and shutdown/termination cleanup in finally.
 * Do not assume fork/join is faster for tiny examples or assert worker order.
 */
public final class ForkJoinArraySum {
    public static long solution(int[] values, int sequentialThreshold,
                                int parallelism, Duration timeout) throws Exception {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ExampleRunner.run("T26 Fork/join array sum",
                "values=[1,2,3,4,5], threshold=2, parallelism=2, deadline=2 seconds",
                "15; owned pool terminated",
                () -> solution(values, 2, 2, Duration.ofSeconds(2)));
    }
}

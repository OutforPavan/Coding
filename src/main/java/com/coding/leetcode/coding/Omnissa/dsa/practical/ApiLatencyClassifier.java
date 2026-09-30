package com.coding.leetcode.coding.Omnissa.dsa.practical;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;
import java.util.Optional;

/**
 * D12 | P0 | Classify an API as fast when its arithmetic mean latency is strictly below 500 ms.
 * <p>Problem: Classify an API as fast when its arithmetic mean latency is strictly below 500 ms.
 * <p>Contract: Non-null array of nonnegative latency values in milliseconds. Return Optional.empty() for no samples, Optional.of(true) for mean below 500, otherwise Optional.of(false). Avoid overflow and premature integer division. Do not mutate input.
 * <p>Evidence: R S4: average latency threshold task; absence representation and numeric contract are practice choices. <a href="https://leetcode.com/discuss/post/6892873/">S4</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class ApiLatencyClassifier {
    public static Optional<Boolean> isFast(long[] latencyMillis) {
        throw new UnsupportedOperationException("TODO: implement isFast");
    }

    public static void main(String[] args) {
        long[] fast = {450, 500, 499};
        ExampleRunner.run("D12 below threshold", Arrays.toString(fast), "Optional[true]", () -> isFast(fast));
        long[] boundary = {400, 600};
        ExampleRunner.run("D12 exactly 500 ms", Arrays.toString(boundary), "Optional[false]", () -> isFast(boundary));
        long[] empty = {};
        ExampleRunner.run("D12 no samples", "[]", "Optional.empty", () -> isFast(empty));
    }
}

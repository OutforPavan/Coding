package com.coding.leetcode.coding.Omnissa.dsa.heaps;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;
import java.util.List;

/**
 * D15 | P1 | Return the k most frequent distinct integer values with their counts.
 * <p>Problem: Return the k most frequent distinct integer values with their counts.
 * <p>Contract: Non-null input and nonnegative k. Return up to k ValueFrequency records ordered by descending count, then ascending numeric value to break ties. Do not mutate input.
 * <p>Evidence: R S1, C# track: broad top-K task. Frequency interpretation and deterministic tie rules are explicit practice variants. <a href="https://leetcode.com/discuss/post/8386158/omnissa-formerly-vmware-mts-2-bengaluru-7sb5a/">S1</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class TopKFrequentElements {
    public record ValueFrequency(int value, long count) { }

    public static List<ValueFrequency> topKFrequent(int[] values, int k) {
        throw new UnsupportedOperationException("TODO: implement topKFrequent");
    }

    public static void main(String[] args) {
        int[] values = {1, 1, 1, 2, 2, 3};
        int k = 2;
        ExampleRunner.run("D15 most frequent values", Arrays.toString(values) + ", k=" + k,
                "[ValueFrequency[value=1, count=3], ValueFrequency[value=2, count=2]]", () -> topKFrequent(values, k));
        int[] ties = {2, 1};
        ExampleRunner.run("D15 deterministic tie", "[2, 1], k=1", "[ValueFrequency[value=1, count=1]]", () -> topKFrequent(ties, 1));
        int[] empty = {};
        ExampleRunner.run("D15 empty values", "[], k=3", "[]", () -> topKFrequent(empty, 3));
    }
}

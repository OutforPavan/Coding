package com.coding.leetcode.coding.Omnissa.dsa.heaps;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;

/**
 * D15 | P1 | Return the k largest array elements, retaining duplicate values.
 * <p>Problem: Return the k largest array elements, retaining duplicate values.
 * <p>Contract: Non-null input and nonnegative k. Return min(k, input length) values in descending order; k=0 returns empty. Do not mutate input.
 * <p>Evidence: R S1, C# track: top-K elements. Largest-values interpretation and output ordering are an explicit practice variant. <a href="https://leetcode.com/discuss/post/8386158/omnissa-formerly-vmware-mts-2-bengaluru-7sb5a/">S1</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class TopKLargestElements {
    public static int[] topKLargest(int[] values, int k) {
        throw new UnsupportedOperationException("TODO: implement topKLargest");
    }

    public static void main(String[] args) {
        int[] values = {3, 1, 5, 5, 2};
        int k = 3;
        ExampleRunner.run("D15 largest values", Arrays.toString(values) + ", k=" + k, "[5, 5, 3]", () -> topKLargest(values, k));
        ExampleRunner.run("D15 k zero", Arrays.toString(values) + ", k=0", "[]", () -> topKLargest(values, 0));
        int[] shortInput = {2, 1};
        ExampleRunner.run("D15 k exceeds length", "[2, 1], k=5", "[2, 1]", () -> topKLargest(shortInput, 5));
    }
}

package com.coding.leetcode.coding.Omnissa.dsa.arrays;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;
import java.util.Optional;

/**
 * D04 | P0 | Return the first value encountered for a second time when scanning left to right.
 * <p>Problem: Return the first value encountered for a second time when scanning left to right.
 * <p>Contract: Non-null int array; do not mutate input. First means earliest second occurrence, not earliest original position. Return Optional.empty() when no duplicate exists.
 * <p>Evidence: R S3: duplicate task and Optional follow-up; exact first-duplicate semantics were absent and are specified here. <a href="https://leetcode.com/discuss/post/5883991/Omnissa-or-Member-of-Technical-Staff-III-or-Bengaluru-or-Offer/">S3</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class FirstDuplicateElement {
    public static Optional<Integer> firstDuplicate(int[] values) {
        throw new UnsupportedOperationException("TODO: implement firstDuplicate");
    }

    public static void main(String[] args) {
        int[] input = {2, 1, 1, 2};
        ExampleRunner.run("D04 earliest second occurrence", Arrays.toString(input), "Optional[1]", () -> firstDuplicate(input));
        int[] unique = {1, 2, 3};
        ExampleRunner.run("D04 no duplicate", Arrays.toString(unique), "Optional.empty", () -> firstDuplicate(unique));
        int[] negative = {-1, -1};
        ExampleRunner.run("D04 negative value is valid", Arrays.toString(negative), "Optional[-1]", () -> firstDuplicate(negative));
    }
}

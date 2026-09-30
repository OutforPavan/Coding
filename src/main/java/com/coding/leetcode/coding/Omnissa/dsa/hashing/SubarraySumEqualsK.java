package com.coding.leetcode.coding.Omnissa.dsa.hashing;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | SubarraySumEqualsK
 * Count nonempty contiguous subarrays whose sum equals k. Negative values are allowed.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class SubarraySumEqualsK {

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        ExampleRunner.run("Subarray count", "[1, 1, 1], k=2", "2", () -> countSubarrays(nums, 2));
        ExampleRunner.run("Negative values", "[1, -1, 0], k=0", "3", () -> countSubarrays(new int[]{1, -1, 0}, 0));
    }

    public static long countSubarrays(int[] nums, long k) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement countSubarrays");
    }
}

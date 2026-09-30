package com.coding.leetcode.coding.Omnissa.dsa.arrays;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P2 | SlidingWindowMaximum
 * Return the maximum in each contiguous window of size k. 1 <= k <= nums.length.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        ExampleRunner.run("Window maximums", "[1,3,-1,-3,5,3,6,7], k=3", "[3, 3, 5, 5, 6, 7]", () -> maximums(nums, 3));
    }

    public static int[] maximums(int[] nums, int k) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement maximums");
    }
}

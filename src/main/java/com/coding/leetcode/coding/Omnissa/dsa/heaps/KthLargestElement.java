package com.coding.leetcode.coding.Omnissa.dsa.heaps;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | KthLargestElement
 * Return the kth largest value counting duplicates. k is valid and one-based.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class KthLargestElement {

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        ExampleRunner.run("Kth largest", "[3,2,1,5,6,4], k=2", "5", () -> kthLargest(nums, 2));
    }

    public static int kthLargest(int[] nums, int k) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement kthLargest");
    }
}

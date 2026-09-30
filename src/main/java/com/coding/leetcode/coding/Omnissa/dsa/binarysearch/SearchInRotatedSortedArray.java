package com.coding.leetcode.coding.Omnissa.dsa.binarysearch;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | SearchInRotatedSortedArray
 * Find the target index in a rotated ascending array with distinct elements. Return -1 if absent.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        ExampleRunner.run("Rotated search", "[4,5,6,7,0,1,2], target=0", "4", () -> search(nums, 0));
        ExampleRunner.run("Absent", "same array, target=3", "-1", () -> search(nums, 3));
    }

    public static int search(int[] nums, int target) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement search");
    }
}

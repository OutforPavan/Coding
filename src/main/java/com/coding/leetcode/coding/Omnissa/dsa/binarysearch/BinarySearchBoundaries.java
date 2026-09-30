package com.coding.leetcode.coding.Omnissa.dsa.binarysearch;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | BinarySearchBoundaries
 * For ascending input, lowerBound returns first index with value >= target; upperBound first > target. Return n if none. Range returns [-1,-1] if absent.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class BinarySearchBoundaries {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 4};
        ExampleRunner.run("Lower bound", "[1,2,2,2,4], target=2", "1", () -> lowerBound(nums, 2));
        ExampleRunner.run("Upper bound", "[1,2,2,2,4], target=2", "4", () -> upperBound(nums, 2));
        ExampleRunner.run("First/last", "[1,2,2,2,4], target=2", "[1, 3]", () -> firstAndLastPosition(nums, 2));
    }

    public static int lowerBound(int[] nums, int target) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement lowerBound");
    }

    public static int upperBound(int[] nums, int target) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement upperBound");
    }

    public static int[] firstAndLastPosition(int[] nums, int target) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement firstAndLastPosition");
    }
}

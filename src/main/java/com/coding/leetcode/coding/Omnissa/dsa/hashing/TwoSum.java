package com.coding.leetcode.coding.Omnissa.dsa.hashing;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | TwoSum
 * Return indices of the unique pair summing to target; do not reuse an index. Return an empty array if absent.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        ExampleRunner.run("Pair", "[2, 7, 11, 15], target=9", "[0, 1] (either index order)", () -> twoSum(nums, target));
        ExampleRunner.run("Absent", "[1, 2], target=8", "[]", () -> twoSum(new int[]{1, 2}, 8));
    }

    public static int[] twoSum(int[] nums, int target) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement twoSum");
    }
}

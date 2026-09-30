package com.coding.leetcode.coding.Omnissa.dsa.arrays;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;

/**
 * D21 | P2 | Find the largest sum of a nonempty contiguous subarray.
 * <p>Problem: Find the largest sum of a nonempty contiguous subarray.
 * <p>Contract: Non-null, nonempty int array. Return long to hold the sum; do not mutate input. All-negative input must return the largest individual value. Reject empty input with IllegalArgumentException.
 * <p>Evidence: U S11: uncertain provenance and duplicated report. This is a standard practice interpretation of maximum subarray. <a href="https://www.reddit.com/r/Technical_Interview/comments/1wkc1zw/sweomnissa_software_engineer_interview_experience/">S11</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class MaximumSubarray {
    public static long maxSubarraySum(int[] values) {
        throw new UnsupportedOperationException("TODO: implement maxSubarraySum");
    }

    public static void main(String[] args) {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        ExampleRunner.run("D21 mixed values", Arrays.toString(input), "6", () -> maxSubarraySum(input));
        int[] negative = {-8, -3, -6};
        ExampleRunner.run("D21 all negative", Arrays.toString(negative), "-3", () -> maxSubarraySum(negative));
        int[] single = {5};
        ExampleRunner.run("D21 one element", Arrays.toString(single), "5", () -> maxSubarraySum(single));
    }
}

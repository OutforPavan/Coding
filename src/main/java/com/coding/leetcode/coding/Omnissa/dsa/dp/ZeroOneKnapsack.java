package com.coding.leetcode.coding.Omnissa.dsa.dp;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P2 | ZeroOneKnapsack
 * Maximize total value within capacity. Every item can be selected at most once; weights are positive and values nonnegative.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class ZeroOneKnapsack {

    public static void main(String[] args) {

        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        ExampleRunner.run("0/1 knapsack", "weights=[1,3,4,5], values=[1,4,5,7], capacity=7", "9", () -> maximumValue(weights, values, 7));
    }

    public static long maximumValue(int[] weights, int[] values, int capacity) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement maximumValue");
    }
}

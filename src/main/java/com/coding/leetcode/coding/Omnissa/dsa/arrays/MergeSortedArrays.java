package com.coding.leetcode.coding.Omnissa.dsa.arrays;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | MergeSortedArrays
 * Return a new sorted array containing every element of two ascending arrays, retaining duplicates.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] first = {1, 3, 5};
        int[] second = {2, 3, 6};
        ExampleRunner.run("Merge arrays", "[1,3,5] and [2,3,6]", "[1, 2, 3, 3, 5, 6]", () -> merge(first, second));
    }

    public static int[] merge(int[] first, int[] second) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement merge");
    }
}

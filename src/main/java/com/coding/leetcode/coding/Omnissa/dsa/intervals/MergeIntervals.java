package com.coding.leetcode.coding.Omnissa.dsa.intervals;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | MergeIntervals
 * Merge overlapping closed intervals and return intervals sorted by start. Touching endpoints overlap.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        ExampleRunner.run("Merge", "[[1,3],[2,6],[8,10],[15,18]]", "[[1, 6], [8, 10], [15, 18]]", () -> mergeIntervals(intervals));
    }

    public static int[][] mergeIntervals(int[][] intervals) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement mergeIntervals");
    }
}

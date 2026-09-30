package com.coding.leetcode.coding.Omnissa.dsa.backtracking;

import java.util.List;
import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P2 | Subsets
 * Return every subset of distinct input integers, including the empty subset. Outer ordering is unrestricted.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class Subsets {

    public static void main(String[] args) {

        int[] nums = {1, 2};
        ExampleRunner.run("Power set", "[1,2]", "[[], [1], [2], [1,2]]; any outer order", () -> subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement subsets");
    }
}

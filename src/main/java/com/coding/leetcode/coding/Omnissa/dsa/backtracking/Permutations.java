package com.coding.leetcode.coding.Omnissa.dsa.backtracking;

import java.util.List;
import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P2 | Permutations
 * Return every permutation of distinct input integers. Ordering of permutations is unrestricted.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class Permutations {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        ExampleRunner.run("Permutations", "[1,2,3]", "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]; any outer order", () -> permutations(nums));
    }

    public static List<List<Integer>> permutations(int[] nums) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement permutations");
    }
}

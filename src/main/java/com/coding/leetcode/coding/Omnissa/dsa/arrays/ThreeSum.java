package com.coding.leetcode.coding.Omnissa.dsa.arrays;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;
import java.util.List;

/**
 * D26 | P1 | Return every unique value triplet whose sum is zero.
 * <p>Problem: Return every unique value triplet whose sum is zero.
 * <p>Contract: Non-null int array; each triplet uses three distinct indices. Each returned triplet is sorted ascending; return distinct triplets in lexicographic order. Input mutation is allowed, so main passes clones. Use overflow-safe arithmetic. Fewer than three values returns an empty list.
 * <p>Evidence: R S14: three-sum on an isolated Glassdoor question page. Exact output and mutation rules are practice choices. <a href="https://www.glassdoor.com/Interview/Data-Structures-and-Algorithms-specifically-on-trees-strings-and-the-three-sum-problem-QTN_8580321.htm">S14</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        throw new UnsupportedOperationException("TODO: implement threeSum");
    }

    public static void main(String[] args) {
        int[] input = {-1, 0, 1, 2, -1, -4};
        ExampleRunner.run("D26 unique zero-sum triplets", Arrays.toString(input), "[[-1, -1, 2], [-1, 0, 1]]", () -> threeSum(input.clone()));
        int[] zeros = {0, 0, 0, 0};
        ExampleRunner.run("D26 duplicate values", Arrays.toString(zeros), "[[0, 0, 0]]", () -> threeSum(zeros.clone()));
        int[] shortInput = {1, 2};
        ExampleRunner.run("D26 insufficient values", Arrays.toString(shortInput), "[]", () -> threeSum(shortInput.clone()));
    }
}

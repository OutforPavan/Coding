package com.coding.leetcode.coding.Omnissa.dsa.arrays;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;

/**
 * D08 | P0 | Return the squares of a sorted integer array in nondecreasing order.
 * <p>Problem: Return the squares of a sorted integer array in nondecreasing order.
 * <p>Contract: Input is non-null and sorted ascending; do not mutate it. Return long[] so the square of any int fits; empty input returns an empty result.
 * <p>Evidence: I S8: sorted-squares task. long output is an explicit overflow-safe practice choice. <a href="https://www.reddit.com/r/leetcode/comments/1ktn2cw/omnissa_sde_interview/">S8</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class SortedSquares {
    public static long[] sortedSquares(int[] nums) {
        throw new UnsupportedOperationException("TODO: implement sortedSquares");
    }

    public static void main(String[] args) {
        int[] input = {-4, -1, 0, 3, 10};
        ExampleRunner.run("D08 mixed signs", Arrays.toString(input), "[0, 1, 9, 16, 100]", () -> sortedSquares(input));
        int[] negatives = {-7, -3, -1};
        ExampleRunner.run("D08 all negative", Arrays.toString(negatives), "[1, 9, 49]", () -> sortedSquares(negatives));
        int[] boundary = {Integer.MIN_VALUE};
        ExampleRunner.run("D08 overflow boundary", Arrays.toString(boundary), "[4611686018427387904]", () -> sortedSquares(boundary));
    }
}

package com.coding.leetcode.coding.Omnissa.dsa.arrays;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;

/**
 * D01 | P0 | Rotate an integer array right by k positions.
 * <p>Problem: Rotate an integer array right by k positions.
 * <p>Contract: Mutate nums in place; non-null input; k must be nonnegative. Normalize k for nonempty arrays. Empty arrays and k=0 are valid no-ops.
 * <p>Evidence: R: rotation reported in S1; I: indexed report in S6. Right rotation and edge behavior are explicit practice choices. <a href="https://leetcode.com/discuss/post/8386158/omnissa-formerly-vmware-mts-2-bengaluru-7sb5a/">S1</a>, <a href="https://leetcode.com/discuss/post/8368034/">S6</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class ArrayRotationByKPosition {
    public static void rotateArray(int[] nums, int k) {
        throw new UnsupportedOperationException("TODO: implement rotateArray");
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int k = 2;
        ExampleRunner.run("D01 right rotation", Arrays.toString(input) + ", k=" + k,
                "[4, 5, 1, 2, 3]", () -> {
                    int[] copy = input.clone();
                    rotateArray(copy, k);
                    return copy;
                });
        int[] empty = {};
        ExampleRunner.run("D01 empty input", "[], k=7", "[]", () -> {
            int[] copy = empty.clone();
            rotateArray(copy, 7);
            return copy;
        });
        int[] largeK = {1, 2, 3};
        ExampleRunner.run("D01 k larger than length", "[1, 2, 3], k=4", "[3, 1, 2]", () -> {
            int[] copy = largeK.clone();
            rotateArray(copy, 4);
            return copy;
        });
    }
}

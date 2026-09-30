package com.coding.leetcode.coding.Omnissa.dsa.heaps;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | RunningMedian
 * Return the median after each insertion. For an even prefix use the arithmetic mean without integer overflow.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class RunningMedian {

    public static void main(String[] args) {

        int[] stream = {5, 15, 1, 3};
        ExampleRunner.run("Running medians", "[5,15,1,3]", "[5.0, 10.0, 5.0, 4.0]", () -> runningMedians(stream));
    }

    public static double[] runningMedians(int[] stream) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement runningMedians");
    }
}

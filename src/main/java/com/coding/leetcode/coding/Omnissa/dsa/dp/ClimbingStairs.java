package com.coding.leetcode.coding.Omnissa.dsa.dp;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P2 | ClimbingStairs
 * Count ways to climb n steps using moves of one or two steps. 0 <= n <= 90; zero steps has one empty way.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class ClimbingStairs {

    public static void main(String[] args) {

        int n = 5;
        ExampleRunner.run("Stair combinations", "n=5", "8", () -> countWays(n));
        ExampleRunner.run("Zero steps", "n=0", "1", () -> countWays(0));
    }

    public static long countWays(int n) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement countWays");
    }
}

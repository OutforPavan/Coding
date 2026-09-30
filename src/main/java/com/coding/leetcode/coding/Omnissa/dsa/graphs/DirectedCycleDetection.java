package com.coding.leetcode.coding.Omnissa.dsa.graphs;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | DirectedCycleDetection
 * Return whether a directed graph has a cycle, including self-loops and disconnected components.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class DirectedCycleDetection {

    public static void main(String[] args) {

        int[][] cyclic = {{0, 1}, {1, 2}, {2, 0}};
        ExampleRunner.run("Cycle", "V=3, 0->1->2->0", "true", () -> hasCycle(3, cyclic));
        ExampleRunner.run("Acyclic", "V=3, 0->1->2", "false", () -> hasCycle(3, new int[][]{{0, 1}, {1, 2}}));
    }

    public static boolean hasCycle(int vertices, int[][] edges) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement hasCycle");
    }
}

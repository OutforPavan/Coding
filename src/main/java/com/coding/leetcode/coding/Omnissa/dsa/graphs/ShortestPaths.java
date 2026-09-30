package com.coding.leetcode.coding.Omnissa.dsa.graphs;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P2 | ShortestPaths
 * Return distances from source in a directed graph with nonnegative integer edge weights. Each edge is [from,to,weight]; unreachable distance is Long.MAX_VALUE.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class ShortestPaths {

    public static void main(String[] args) {

        int[][] edges = {{0, 1, 4}, {0, 2, 1}, {2, 1, 2}, {1, 3, 1}, {2, 3, 5}};
        ExampleRunner.run("Distances", "V=4, edges=[[0,1,4],[0,2,1],[2,1,2],[1,3,1],[2,3,5]], source=0", "[0, 3, 1, 4]", () -> shortestDistances(4, edges, 0));
    }

    public static long[] shortestDistances(int vertices, int[][] edges, int source) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement shortestDistances");
    }
}

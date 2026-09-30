package com.coding.leetcode.coding.Omnissa.dsa.graphs;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | ConnectedComponents
 * Count connected components of an undirected graph, including isolated vertices.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class ConnectedComponents {

    public static void main(String[] args) {

        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        ExampleRunner.run("Components", "V=6, edges=[[0,1],[1,2],[3,4]]", "3", () -> countComponents(6, edges));
    }

    public static int countComponents(int vertices, int[][] edges) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement countComponents");
    }
}

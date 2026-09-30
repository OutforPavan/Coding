package com.coding.leetcode.coding.Omnissa.dsa.graphs;

import java.util.List;
import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | GraphTraversals
 * Return vertices reachable from start in an undirected graph. Visit neighbors in ascending order. Ignore disconnected vertices.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class GraphTraversals {

    public static void main(String[] args) {

        int[][] edges = {{0, 1}, {0, 2}, {1, 3}};
        ExampleRunner.run("BFS", "V=5, edges=[[0,1],[0,2],[1,3]], start=0", "[0, 1, 2, 3]", () -> breadthFirst(5, edges, 0));
        ExampleRunner.run("DFS", "same graph and ascending neighbor order", "[0, 1, 3, 2]", () -> depthFirst(5, edges, 0));
    }

    public static List<Integer> breadthFirst(int vertices, int[][] edges, int start) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement breadthFirst");
    }

    public static List<Integer> depthFirst(int vertices, int[][] edges, int start) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement depthFirst");
    }
}

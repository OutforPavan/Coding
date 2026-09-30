package com.coding.leetcode.coding.Omnissa.dsa.graphs;

import java.util.List;
import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P2 | UnionFind
 * Maintain disjoint sets over 0..size-1. union merges sets; connected checks membership in the same set; componentCount returns remaining sets.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class UnionFind {
    public UnionFind(int size) {
        // TODO: initialize your data structure.
    }

    public int find(int value) {
        throw new UnsupportedOperationException("TODO: implement find");
    }

    public void union(int first, int second) {
        throw new UnsupportedOperationException("TODO: implement union");
    }

    public boolean connected(int first, int second) {
        throw new UnsupportedOperationException("TODO: implement connected");
    }

    public int componentCount() {
        throw new UnsupportedOperationException("TODO: implement componentCount");
    }
    public static void main(String[] args) {

        UnionFind sets = new UnionFind(5);
        ExampleRunner.run("Disjoint sets", "union(0,1), union(1,2); connected(0,2), connected(0,4), count", "[true, false, 3]", () -> {
            sets.union(0, 1);
            sets.union(1, 2);
            return List.of(sets.connected(0, 2), sets.connected(0, 4), sets.componentCount());
        });
    }


}

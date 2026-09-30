package com.coding.leetcode.coding.Omnissa.dsa.graphs;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | FloodFill
 * Change the four-directionally connected region containing (row, col) to newColor; mutate and return the image.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class FloodFill {

    public static void main(String[] args) {

        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        ExampleRunner.run("Fill region", "image=[[1,1,1],[1,1,0],[1,0,1]], start=(1,1), newColor=2", "[[2, 2, 2], [2, 2, 0], [2, 0, 1]]", () -> floodFill(image, 1, 1, 2));
    }

    public static int[][] floodFill(int[][] image, int row, int col, int newColor) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement floodFill");
    }
}

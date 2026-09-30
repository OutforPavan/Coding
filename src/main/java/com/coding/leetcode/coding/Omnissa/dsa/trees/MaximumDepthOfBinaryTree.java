package com.coding.leetcode.coding.Omnissa.dsa.trees;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.TreeNode;

/**
 * D18 / P0 tree coverage | P0 | MaximumDepthOfBinaryTree
 * Return the number of nodes on the longest root-to-leaf path. Null has depth zero.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
        ExampleRunner.run("Depth", "tree: 4 -> (2 -> (1, 3), 6)", "3", () -> maxDepth(root));
        ExampleRunner.run("Empty tree", "null", "0", () -> maxDepth(null));
    }

    public static int maxDepth(TreeNode root) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement maxDepth");
    }
}

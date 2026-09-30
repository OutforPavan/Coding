package com.coding.leetcode.coding.Omnissa.dsa.trees;

import java.util.List;
import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.TreeNode;

/**
 * D18 / P0 tree coverage | P0 | BinaryTreeLevelOrderTraversal
 * Return one list per level, from left to right.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
        ExampleRunner.run("Level order", "tree: 4 -> (2 -> (1, 3), 6)", "[[4], [2, 6], [1, 3]]", () -> levelOrder(root));
        ExampleRunner.run("Empty tree", "null", "[]", () -> levelOrder(null));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement levelOrder");
    }
}

package com.coding.leetcode.coding.Omnissa.dsa.trees;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.TreeNode;

/**
 * D18 / P0 tree coverage | P0 | ValidateBinarySearchTree
 * Every left descendant must be smaller and every right descendant larger. Duplicates are invalid.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
        ExampleRunner.run("Valid BST", "tree: 4 -> (2 -> (1, 3), 6)", "true", () -> isValidBst(root));
        TreeNode invalid = new TreeNode(4, new TreeNode(2, null, new TreeNode(5)), new TreeNode(6));
        ExampleRunner.run("Ancestor constraint", "5 is in the left subtree of 4", "false", () -> isValidBst(invalid));
    }

    public static boolean isValidBst(TreeNode root) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement isValidBst");
    }
}

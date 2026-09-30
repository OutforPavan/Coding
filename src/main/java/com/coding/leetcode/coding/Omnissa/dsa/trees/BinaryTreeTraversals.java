package com.coding.leetcode.coding.Omnissa.dsa.trees;

import java.util.List;
import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.TreeNode;

/**
 * D18 / P0 tree coverage | P0 | BinaryTreeTraversals
 * Return preorder, inorder and postorder values. Empty input returns an empty list.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class BinaryTreeTraversals {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
        ExampleRunner.run("Preorder", "tree: 4 -> (2 -> (1, 3), 6)", "[4, 2, 1, 3, 6]", () -> preorder(root));
        ExampleRunner.run("Inorder", "same tree", "[1, 2, 3, 4, 6]", () -> inorder(root));
        ExampleRunner.run("Postorder", "same tree", "[1, 3, 2, 6, 4]", () -> postorder(root));
        ExampleRunner.run("Empty tree", "null", "[]", () -> preorder(null));
    }

    public static List<Integer> preorder(TreeNode root) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement preorder");
    }

    public static List<Integer> inorder(TreeNode root) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement inorder");
    }

    public static List<Integer> postorder(TreeNode root) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement postorder");
    }
}

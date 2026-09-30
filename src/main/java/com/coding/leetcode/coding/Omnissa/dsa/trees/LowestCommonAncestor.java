package com.coding.leetcode.coding.Omnissa.dsa.trees;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.TreeNode;

/**
 * D18 / P0 tree coverage | P0 | LowestCommonAncestor
 * Return the existing lowest common ancestor node by identity. Both targets are guaranteed to exist.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
        ExampleRunner.run("Same branch", "targets: node 1 and node 3", "TreeNode(2)", () -> lowestCommonAncestor(root, root.left.left, root.left.right));
        ExampleRunner.run("Different branches", "targets: node 1 and node 6", "TreeNode(4)", () -> lowestCommonAncestor(root, root.left.left, root.right));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode first, TreeNode second) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement lowestCommonAncestor");
    }
}

package com.coding.leetcode.coding.Omnissa.dsa.stacksqueues;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * D05 | P0 | Check that brackets are correctly nested and matched by type.
 * <p>Problem: Check that brackets are correctly nested and matched by type.
 * <p>Contract: Non-null input containing only (), [] and {}. Reject other characters with IllegalArgumentException. Empty input is balanced.
 * <p>Evidence: R S4: balanced-parentheses task. Bracket alphabet and invalid-character policy are practice choices. <a href="https://leetcode.com/discuss/post/6892873/">S4</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class BalancedParentheses {
    public static boolean isBalanced(String brackets) {
        throw new UnsupportedOperationException("TODO: implement isBalanced");
    }

    public static void main(String[] args) {
        String input = "{[()]}";
        ExampleRunner.run("D05 nested brackets", input, "true", () -> isBalanced(input));
        String mismatch = "([)]";
        ExampleRunner.run("D05 mismatched nesting", mismatch, "false", () -> isBalanced(mismatch));
        String empty = "";
        ExampleRunner.run("D05 empty input", "empty string", "true", () -> isBalanced(empty));
    }
}

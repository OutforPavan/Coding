package com.coding.leetcode.coding.Omnissa.dsa.strings;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * D06 | P0 | Repeatedly cancel adjacent pairs of equal characters.
 * <p>Problem: Repeatedly cancel adjacent pairs of equal characters.
 * <p>Contract: Non-null String using UTF-16 char values. Remove equal adjacent pairs until no pair remains; this is pair cancellation, not removal of whole runs. Empty input returns an empty string.
 * <p>Evidence: I S5: adjacent-duplicate removal was reported, but semantics were missing. Repeated pair cancellation is an illustrative practice variant, not a verified original prompt. <a href="https://leetcode.com/discuss/post/8338453/">S5</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class RemoveAdjacentDuplicates {
    public static String removeAdjacentDuplicates(String text) {
        throw new UnsupportedOperationException("TODO: implement removeAdjacentDuplicates");
    }

    public static void main(String[] args) {
        String input = "abbaca";
        ExampleRunner.run("D06 recursive pair cancellation", input, "ca", () -> removeAdjacentDuplicates(input));
        String oddRun = "aaa";
        ExampleRunner.run("D06 odd run retains one", oddRun, "a", () -> removeAdjacentDuplicates(oddRun));
        String empty = "";
        ExampleRunner.run("D06 empty input", "empty string", "empty string", () -> removeAdjacentDuplicates(empty));
    }
}

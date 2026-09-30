package com.coding.leetcode.coding.Omnissa.dsa.strings;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * D17 | P1 | Remove exactly one character from each adjacent run whose length is at least two.
 * <p>Problem: Remove exactly one character from each adjacent run whose length is at least two.
 * <p>Contract: Non-null String using UTF-16 char values. Preserve singleton runs; a run of length m greater than one becomes length m-1. Process the original runs once. This is not recursive pair cancellation.
 * <p>Evidence: R S9: candidate supplied aaabbbaabbcd to aabbabcd. C# report adapted to Java. <a href="https://www.reddit.com/r/OmnissaEUC/comments/1u2y8af/senior_software_interview_coding_round/">S9</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class ReduceRepeatedRunsByOne {
    public static String reduceRunsByOne(String text) {
        throw new UnsupportedOperationException("TODO: implement reduceRunsByOne");
    }

    public static void main(String[] args) {
        String input = "aaabbbaabbcd";
        ExampleRunner.run("D17 reported example", input, "aabbabcd", () -> reduceRunsByOne(input));
        String singles = "abc";
        ExampleRunner.run("D17 singleton runs", singles, "abc", () -> reduceRunsByOne(singles));
        String pair = "aa";
        ExampleRunner.run("D17 one pair", pair, "a", () -> reduceRunsByOne(pair));
    }
}

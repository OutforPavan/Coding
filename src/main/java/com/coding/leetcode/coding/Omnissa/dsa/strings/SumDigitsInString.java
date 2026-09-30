package com.coding.leetcode.coding.Omnissa.dsa.strings;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * D11 | P0 | Sum the individual ASCII digits in a string.
 * <p>Problem: Sum the individual ASCII digits in a string.
 * <p>Contract: Non-null input. Only characters 0 through 9 contribute; ignore all others. Adjacent digits are separate digits, not a multi-digit number. Return long; empty input returns 0.
 * <p>Evidence: R S4: digit-sum task. ASCII-only and individual-digit semantics are stated practice assumptions. <a href="https://leetcode.com/discuss/post/6892873/">S4</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class SumDigitsInString {
    public static long sumDigits(String text) {
        throw new UnsupportedOperationException("TODO: implement sumDigits");
    }

    public static void main(String[] args) {
        String input = "a12b3";
        ExampleRunner.run("D11 individual digits", input, "6", () -> sumDigits(input));
        String noDigits = "Java";
        ExampleRunner.run("D11 no digits", noDigits, "0", () -> sumDigits(noDigits));
        String signed = "-20.5";
        ExampleRunner.run("D11 ignore non-digits", signed, "7", () -> sumDigits(signed));
    }
}

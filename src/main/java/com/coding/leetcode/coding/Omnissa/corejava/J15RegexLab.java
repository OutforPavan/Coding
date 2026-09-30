package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J15 / P0 — Whole-input validation versus token extraction.
 * The broad Java regex-library task is reported; its exact original specification is unknown.
 * These are illustrative exercises, not a reconstruction. isLettersThenDigits accepts one
 * or more ASCII letters followed by one or more ASCII digits and nothing else; null is false.
 * extractOrderNumbers finds uppercase ORD- followed by one or more ASCII digits where the
 * whole token is bounded on each side by input ends or a non-letter/non-digit/non-underscore.
 * Return only the captured digits, preserving order. No Unicode-letter interpretation is needed.
 * Compile reusable patterns once when you implement them; use a fresh matcher per call.
 * Explain escaping and do not claim every Java regex has linear-time complexity.
 */
public final class J15RegexLab {
    public static boolean isLettersThenDigits(String input) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<String> extractOrderNumbers(String text) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        String valid = "Abc123";
        ExampleRunner.run("J15 whole input", "Abc123", "true", () -> isLettersThenDigits(valid));
        String invalid = "prefix-Abc123-suffix";
        ExampleRunner.run("J15 find is not validation", "prefix-Abc123-suffix", "false",
                () -> isLettersThenDigits(invalid));
        String text = "orders ORD-17, ORD-204; ignore XORD-9 and ORD-8x";
        ExampleRunner.run("J15 capture matching tokens", text, "[17, 204]", () -> extractOrderNumbers(text));
    }
}

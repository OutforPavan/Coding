package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J07 / P0 — String identity, interning and efficient construction.
 * Illustrative lab. identityFacts returns [left == literal, left.equals(literal),
 * left.intern() == literal]. joinTokens joins non-null tokens with the exact delimiter,
 * without a leading/trailing delimiter, using a builder rather than repeated immutable
 * concatenation; an empty list yields the empty string. Do not mutate inputs.
 * Discuss String immutability and the different synchronization contracts of StringBuilder
 * and StringBuffer; no concurrent timing claims are part of this exercise.
 */
public final class J07StringsLab {
    public static List<Boolean> identityFacts(String left, String literal) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static String joinTokens(List<String> tokens, String delimiter) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        String allocated = new String("java");
        String literal = "java";
        ExampleRunner.run("J07 identity and pool", "new String(java) and literal java",
                "[false, true, true]", () -> identityFacts(allocated, literal));
        List<String> tokens = List.of("core", "java", "practice");
        ExampleRunner.run("J07 builder join", "tokens=[core, java, practice], delimiter= / ",
                "core / java / practice", () -> joinTokens(tokens, " / "));
        List<String> empty = List.of();
        ExampleRunner.run("J07 empty join", "tokens=[], delimiter=,", "empty string",
                () -> joinTokens(empty, ","));
    }
}

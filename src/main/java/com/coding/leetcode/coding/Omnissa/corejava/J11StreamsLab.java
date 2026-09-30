package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J11 / P0 — Flatten, filter and short-circuit a stream.
 * Illustrative coding lab. flattenEvenValues returns the first limit DISTINCT even integers
 * in encounter order across the nested lists. Do not mutate input; limit=0 returns empty;
 * a negative limit throws IllegalArgumentException. Lists and their elements are non-null.
 * evaluatedBeforeAndAfterTerminal builds a sequential stream with a counting map stage,
 * records the count before a terminal operation, then collects limit values and returns
 * [countBeforeTerminal, countAfterTerminal]. Use a terminal collection, not count(), whose
 * optimizations may skip a size-preserving stage. Use limit at most the input size.
 * Explain map versus flatMap, laziness, short-circuiting and why a stream cannot be reused.
 */
public final class J11StreamsLab {
    public static List<Integer> flattenEvenValues(List<List<Integer>> groups, int limit) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<Integer> evaluatedBeforeAndAfterTerminal(List<Integer> values, int limit) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<List<Integer>> groups = List.of(List.of(1, 2), List.of(2, 3, 4), List.of(6));
        int limit = 2;
        ExampleRunner.run("J11 flatMap, distinct and limit", "[[1,2],[2,3,4],[6]], limit=2",
                "[2, 4]", () -> flattenEvenValues(groups, limit));
        List<Integer> values = List.of(10, 20, 30, 40);
        ExampleRunner.run("J11 lazy sequential pipeline", "[10,20,30,40], limit=2",
                "[0, 2]", () -> evaluatedBeforeAndAfterTerminal(values, limit));
    }
}

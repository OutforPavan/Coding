package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * J08 / P0 — PECS and bounded generic algorithms.
 * Illustrative lab. copyAll appends source elements to destination in order without raw types
 * or unchecked casts; source and destination are distinct lists. maximum returns the largest
 * non-null element and rejects an empty input with IllegalArgumentException.
 * Use the declared bounds; explain why List<Integer> cannot be assigned to List<Number>,
 * what erasure changes, and which operations the two wildcard bounds permit.
 */
public final class J08GenericsLab {
    public static <T> void copyAll(List<? extends T> source, List<? super T> destination) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static <T extends Comparable<? super T>> T maximum(List<? extends T> values) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<Integer> source = List.of(1, 2, 3);
        List<Number> destination = new ArrayList<>(List.of(0.5));
        ExampleRunner.run("J08 extends producer / super consumer", "source Integer [1,2,3], destination Number [0.5]",
                "[0.5, 1, 2, 3]", () -> {
                    copyAll(source, destination);
                    return destination;
                });
        List<Integer> numbers = List.of(4, 1, 9, 2);
        ExampleRunner.run("J08 bounded maximum", "[4,1,9,2]", "9", () -> maximum(numbers));
        List<String> words = List.of("beta", "alpha", "gamma");
        ExampleRunner.run("J08 generic reuse", "[beta,alpha,gamma]", "gamma", () -> maximum(words));
    }
}

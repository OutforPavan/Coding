package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J16 / P1 — Bound retained cache entries rather than relying on GC.
 * Illustrative lab converted from JVM-memory theory. retainedKeys must model a FIFO cache
 * of capacity maxEntries: first insertion establishes position, updating an existing key
 * keeps its position, and a new key beyond capacity evicts the oldest inserted key.
 * Return retained keys oldest-first. maxEntries must be positive; inputs contain no nulls.
 * Use small metadata fixtures, never allocate until OOM. Explain how an unbounded reachable
 * cache retains objects, and distinguish stack references, heap objects and class metadata.
 * The assertion is about cache reachability, not exact heap bytes or when GC executes.
 */
public final class J16JvmMemoryLab {
    public static List<String> retainedKeys(int maxEntries, List<String> writes) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        int capacity = 2;
        List<String> writes = List.of("A", "B", "A", "C");
        ExampleRunner.run("J16 bounded retention", "capacity=2; writes A,B,A,C; updates keep insertion position",
                "[B, C]; retained entry count never exceeds 2", () -> retainedKeys(capacity, writes));
    }
}

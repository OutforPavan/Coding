package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * J04 / P0 — Safe removal and iterator semantics.
 * Illustrative coding lab. removeNegatives must mutate its supplied list using Iterator.remove
 * and return the surviving values. snapshotBeforeAppend must obtain a CopyOnWriteArrayList
 * iterator before appending, and return what that iterator observes.
 * For weaklyConsistentFacts, create a ConcurrentHashMap, create its iterator, then insert a
 * new key and consume the iterator. Return [completedWithoutCME, mapContainsNewKey].
 * Do not assert that the iterator must see the inserted key. Fail-fast is best-effort bug
 * detection, not synchronization; do not build a test that requires a race to throw CME.
 */
public final class J04IterationLab {
    public static List<Integer> removeNegatives(List<Integer> values) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<Integer> snapshotBeforeAppend(List<Integer> initial, int appended) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<Boolean> weaklyConsistentFacts(List<String> initialKeys, String newKey) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>(List.of(3, -1, 0, -2, 4));
        ExampleRunner.run("J04 iterator removal", "mutable [3, -1, 0, -2, 4]",
                "[3, 0, 4]", () -> removeNegatives(values));
        List<Integer> initial = List.of(1, 2, 3);
        ExampleRunner.run("J04 snapshot iterator", "snapshot iterator of [1,2,3], then append 4",
                "[1, 2, 3]", () -> snapshotBeforeAppend(initial, 4));
        List<String> keys = List.of("A", "B");
        ExampleRunner.run("J04 weak consistency invariants", "iterator over A,B; then insert C",
                "[true, true]; whether C is visited is intentionally unspecified",
                () -> weaklyConsistentFacts(keys, "C"));
    }
}

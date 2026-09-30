package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J02 / P0 — A small integer-key map.
 * Illustrative implementation lab, not a confirmed exact interview prompt. Implement IntMap
 * with separate chaining, floorMod(key, capacity), load factor 0.75, and doubling when a new
 * entry would exceed that load factor. Updating an existing key must not change size.
 * Null values are forbidden; missing get/remove returns null. Support negative keys.
 * runOperations must execute the operations and return one string for each GET, SIZE or REMOVE.
 * Do not rely on HashMap's private implementation. Explain separately why mutable equality/hash
 * keys are unsafe; the Java Map contract does not promise a particular failed-lookup behavior.
 */
public final class J02HashMapLab {
    public enum Kind { PUT, GET, REMOVE, SIZE }

    public static final class Operation {
        public final Kind kind;
        public final int key;
        public final String value;

        public Operation(Kind kind, int key, String value) {
            this.kind = kind;
            this.key = key;
            this.value = value;
        }
    }

    public static final class IntMap {
        public IntMap(int initialCapacity) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
        public void put(int key, String value) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
        public String get(int key) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
        public String remove(int key) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
        public int size() {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }

    public static List<String> runOperations(int initialCapacity, List<Operation> operations) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        int initialCapacity = 4;
        List<Operation> operations = List.of(
                new Operation(Kind.PUT, 1, "A"), new Operation(Kind.PUT, 5, "B"),
                new Operation(Kind.PUT, 9, "C"), new Operation(Kind.PUT, -3, "D"),
                new Operation(Kind.GET, 5, null), new Operation(Kind.SIZE, 0, null),
                new Operation(Kind.PUT, 5, "BB"), new Operation(Kind.GET, 5, null),
                new Operation(Kind.REMOVE, 1, null), new Operation(Kind.GET, 1, null),
                new Operation(Kind.SIZE, 0, null));
        ExampleRunner.run("J02 collisions, resize, update and removal",
                "capacity=4; put 1=A,5=B,9=C,-3=D; get 5; size; put 5=BB; get 5; remove 1; get 1; size",
                "[B, 4, BB, A, null, 3]", () -> runOperations(initialCapacity, operations));
    }
}

package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.Comparator;
import java.util.List;

/**
 * J14 / P0 — A total ordering without arithmetic overflow.
 * Illustrative lab. taskOrdering compares priority descending, owner ascending, then ID
 * ascending. sortedTaskIds returns IDs in that order without changing its input list.
 * Priorities may span the full int range, so subtracting priorities is not a valid comparison.
 * All text fields are non-null. Explain Comparable versus Comparator and comparator contract
 * requirements, including consistency and transitivity.
 */
public final class J14ComparatorsLab {
    public static final class Task {
        public final String id;
        public final String owner;
        public final int priority;
        public Task(String id, String owner, int priority) {
            this.id = id;
            this.owner = owner;
            this.priority = priority;
        }
    }

    public static Comparator<Task> taskOrdering() {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<String> sortedTaskIds(List<Task> tasks) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<Task> tasks = List.of(new Task("C", "zara", Integer.MIN_VALUE),
                new Task("D", "ada", Integer.MAX_VALUE), new Task("B", "bob", 0),
                new Task("A", "ada", Integer.MAX_VALUE));
        ExampleRunner.run("J14 multi-field ordering", "C:zara:MIN, D:ada:MAX, B:bob:0, A:ada:MAX",
                "[A, D, B, C]", () -> sortedTaskIds(tasks));
    }
}

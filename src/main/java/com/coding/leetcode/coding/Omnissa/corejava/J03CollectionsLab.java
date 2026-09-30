package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;
import java.util.Map;

/**
 * J03 / P0 — Choose collections for explicit ordering contracts.
 * Illustrative coding lab. serveJobs returns job IDs in descending priority, preserving
 * arrival order for ties; duplicate IDs are ignored after their first occurrence.
 * sortedFrequencies returns word counts with keys in natural lexicographic order.
 * Explain the collection choices and operation costs; compare ArrayList, LinkedList,
 * ArrayDeque, HashSet, TreeMap, LinkedHashMap and PriorityQueue. Do not use all seven
 * merely to satisfy a checklist. Inputs contain no nulls.
 */
public final class J03CollectionsLab {
    public static final class Job {
        public final String id;
        public final int priority;
        public Job(String id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public static List<String> serveJobs(List<Job> arrivals) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static Map<String, Integer> sortedFrequencies(List<String> words) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<Job> jobs = List.of(new Job("A", 1), new Job("B", 3),
                new Job("C", 3), new Job("A", 9), new Job("D", 2));
        ExampleRunner.run("J03 priority and arrival order", "A:1, B:3, C:3, A:9, D:2",
                "[B, C, D, A]", () -> serveJobs(jobs));
        List<String> words = List.of("pear", "apple", "pear", "banana");
        ExampleRunner.run("J03 sorted frequencies", "[pear, apple, pear, banana]",
                "{apple=1, banana=1, pear=2}", () -> sortedFrequencies(words));
    }
}

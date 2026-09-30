package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * J06 / P0 — An immutable profile that owns its list.
 * Illustrative object-design lab. Complete ImmutableProfile: reject null name/tags and null
 * tag elements, preserve order, copy incoming mutable data, and expose an unmodifiable view
 * or copy. The constructor is intentionally unfinished because copying is part of the task.
 * verifyIsolation constructs a profile, appends lateTag to the original input list, attempts
 * to add "forbidden" through tags(), and returns the profile's final tags. The accessor write
 * must be rejected. Do not modify the profile while catching that expected rejection.
 * Follow-up: explain why a record holding a mutable list is not automatically deeply immutable.
 */
public final class J06ImmutabilityLab {
    public static final class ImmutableProfile {
        private final String name;
        private final List<String> tags;

        public ImmutableProfile(String name, List<String> tags) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
        public String name() {
            throw new UnsupportedOperationException("TODO: implement method");
        }
        public List<String> tags() {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }

    public static List<String> verifyIsolation(String name, List<String> originalTags, String lateTag) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        String name = "Ada";
        List<String> original = new ArrayList<>(List.of("java", "threads"));
        String lateTag = "external-change";
        ExampleRunner.run("J06 defensive copies", "Ada; mutable tags [java, threads]; append external-change",
                "[java, threads]; tags().add(...) must throw UnsupportedOperationException",
                () -> verifyIsolation(name, original, lateTag));
    }
}

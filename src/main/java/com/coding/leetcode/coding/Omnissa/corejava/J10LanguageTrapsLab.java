package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * J10 / P0 — Pass-by-value, null unboxing and overflow.
 * Illustrative lab. mutateAndReassign must increment the passed box's value and then assign
 * its local parameter to a new Box(replacement). observeCallerValue invokes that operation
 * and returns the original caller-owned box's value. unboxOrDefault must avoid null unboxing.
 * addWithoutIntOverflow returns the exact sum of two ints as a long; widening only after
 * overflowing an int addition is incorrect. Discuss wrapper value equality separately.
 */
public final class J10LanguageTrapsLab {
    public static final class Box {
        public int value;
        public Box(int value) {
            this.value = value;
        }
    }

    public static void mutateAndReassign(Box box, int replacement) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static int observeCallerValue(Box original, int replacement) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static int unboxOrDefault(Integer value, int fallback) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static long addWithoutIntOverflow(int left, int right) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        Box original = new Box(10);
        int replacement = 99;
        ExampleRunner.run("J10 reference value copying", "Box(10), replacement=99", "11",
                () -> observeCallerValue(original, replacement));
        Integer absent = null;
        ExampleRunner.run("J10 null unboxing", "value=null, fallback=7", "7", () -> unboxOrDefault(absent, 7));
        int left = Integer.MAX_VALUE;
        int right = 1;
        ExampleRunner.run("J10 widen before arithmetic", "2147483647 + 1", "2147483648",
                () -> addWithoutIntOverflow(left, right));
    }
}

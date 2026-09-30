package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J20 / P1 — Deterministic checks without an external test framework.
 * Broad testing is reported; this exact clamp exercise is illustrative. clamp returns the
 * nearest bound when value lies outside [min,max], otherwise value; min>max throws
 * IllegalArgumentException. runManualChecks must execute the supplied test cases, throw
 * AssertionError on any unexpected result/exception, and return passed labels in input order.
 * Use explicit checks, not the Java assert keyword that may be disabled. Do not catch
 * AssertionError or UnsupportedOperationException and report them as passing tests.
 * Discuss unit versus integration tests, boundary cases, and mocks versus simple fakes.
 */
public final class J20TestingLab {
    public static final class TestCase {
        public final String label;
        public final int value;
        public final int min;
        public final int max;
        public final Integer expectedValue;
        public final boolean expectsInvalidBounds;
        public TestCase(String label, int value, int min, int max,
                        Integer expectedValue, boolean expectsInvalidBounds) {
            this.label = label;
            this.value = value;
            this.min = min;
            this.max = max;
            this.expectedValue = expectedValue;
            this.expectsInvalidBounds = expectsInvalidBounds;
        }
    }

    public static int clamp(int value, int min, int max) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<String> runManualChecks(List<TestCase> cases) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        int value = -1;
        int min = 0;
        int max = 10;
        ExampleRunner.run("J20 function under test", "value=-1, bounds=[0,10]", "0",
                () -> clamp(value, min, max));
        List<TestCase> cases = List.of(new TestCase("below", -1, 0, 10, 0, false),
                new TestCase("atMin", 0, 0, 10, 0, false), new TestCase("inside", 5, 0, 10, 5, false),
                new TestCase("atMax", 10, 0, 10, 10, false), new TestCase("above", 11, 0, 10, 10, false),
                new TestCase("invalidBounds", 5, 10, 0, null, true));
        ExampleRunner.run("J20 manual boundary and exception checks", "six supplied cases",
                "[below, atMin, inside, atMax, above, invalidBounds]", () -> runManualChecks(cases));
    }
}

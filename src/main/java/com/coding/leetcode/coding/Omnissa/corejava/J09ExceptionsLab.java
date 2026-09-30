package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J09 / P0 — Exception translation and suppression.
 * Illustrative lab. parsePositiveCount parses a positive decimal int; invalid text must
 * throw ConfigException retaining NumberFormatException as its cause, and nonpositive
 * parsed values must throw ConfigException with a clear message.
 * FailingResource.close must throw IllegalStateException("close " + name).
 * suppressedFailureMessages must acquire resources A then B in try-with-resources, throw
 * IllegalArgumentException("body") in the body, catch the resulting failure, and return
 * [primary message, suppressed message 1, suppressed message 2]. Do not swallow failures.
 */
public final class J09ExceptionsLab {
    public static final class ConfigException extends Exception {
        private static final long serialVersionUID = 1L;
        public ConfigException(String message, Throwable cause) {
            super(message, cause);
        }
    }
    public static final class FailingResource implements AutoCloseable {
        public final String name;
        public FailingResource(String name) {
            this.name = name;
        }
        @Override public void close() {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }

    public static int parsePositiveCount(String text) throws ConfigException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<String> suppressedFailureMessages(String firstName, String secondName) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        String valid = "12";
        ExampleRunner.run("J09 checked exception boundary", "text=12", "12", () -> parsePositiveCount(valid));
        String invalid = "twelve";
        ExampleRunner.run("J09 preserve cause", "text=twelve",
                "throws ConfigException with NumberFormatException as cause", () -> parsePositiveCount(invalid));
        String first = "A";
        String second = "B";
        ExampleRunner.run("J09 suppressed close failures", "acquire A then B; body throws",
                "[body, close B, close A]", () -> suppressedFailureMessages(first, second));
    }
}

package com.coding.leetcode.coding.Omnissa.support;

import java.util.Arrays;

/** Prints fixture data and a solution's result. It does not implement any exercise. */
public final class ExampleRunner {
    private ExampleRunner() {
    }

    @FunctionalInterface
    public interface CheckedSupplier {
        Object get() throws Exception;
    }

    public static void run(String title, String input, String expected, CheckedSupplier solution) {
        System.out.println("\n--- " + title + " ---");
        System.out.println("Input:    " + input);
        System.out.println("Expected: " + expected);
        try {
            System.out.println("Actual:   " + format(solution.get()));
        } catch (UnsupportedOperationException exception) {
            System.out.println("Actual:   NOT IMPLEMENTED - " + exception.getMessage());
        } catch (Exception exception) {
            System.out.println("Actual:   " + exception.getClass().getSimpleName() + ": " + exception.getMessage());
            exception.printStackTrace(System.out);
        }
    }

    private static String format(Object value) {
        if (value instanceof int[]) return Arrays.toString((int[]) value);
        if (value instanceof long[]) return Arrays.toString((long[]) value);
        if (value instanceof double[]) return Arrays.toString((double[]) value);
        if (value instanceof boolean[]) return Arrays.toString((boolean[]) value);
        if (value instanceof char[]) return Arrays.toString((char[]) value);
        if (value instanceof Object[]) return Arrays.deepToString((Object[]) value);
        return String.valueOf(value);
    }
}

package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J05 / P0 — Resolve a default-method conflict and distinguish dispatch rules.
 * The broad diamond-problem topic is reported; these exact coding fixtures are illustrative.
 * LeftGreeting.greet must return "Hello, " + name; RightGreeting.greet returns "Welcome, " + name.
 * CombinedGreeting must resolve the conflict by invoking both interface defaults and joining
 * them with " | ". Implement Parent.describe(Number) as "parent-number", the Child override
 * as "child-number", and the Child overload describe(Integer) as "child-integer".
 * dispatch must call describe first through a Parent reference to a Child, then through
 * the Child reference, passing the same Integer; return the two results in that order.
 * Discuss interface versus abstract class and when composition would be preferable.
 */
public final class J05OopLab {
    public interface LeftGreeting {
        default String greet(String name) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }
    public interface RightGreeting {
        default String greet(String name) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }
    public static final class CombinedGreeting implements LeftGreeting, RightGreeting {
        @Override public String greet(String name) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }
    public static class Parent {
        public String describe(Number number) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }
    public static final class Child extends Parent {
        @Override public String describe(Number number) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
        public String describe(Integer number) {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }

    public static List<String> dispatch(Integer number) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        String name = "Maya";
        ExampleRunner.run("J05 default conflict", "name=Maya", "Hello, Maya | Welcome, Maya",
                () -> new CombinedGreeting().greet(name));
        Integer number = 7;
        ExampleRunner.run("J05 overload versus override", "Integer 7 through Parent and Child references",
                "[child-number, child-integer]", () -> dispatch(number));
    }
}

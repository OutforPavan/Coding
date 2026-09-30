package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J24 / P2 — Modern language features available without preview flags on Java 17.
 * Illustrative lab. runningBalances applies DEPOSIT/WITHDRAW commands in order, returning
 * the balance after each; amounts must be positive and overdrafts throw IllegalArgumentException.
 * Use long arithmetic with overflow checks. Introduce your own record command data and sealed
 * command hierarchy while implementing; fixture holders below are deliberately plain classes.
 * A switch expression on CommandKind and instanceof pattern matching are available in Java 17;
 * do not use pattern matching for switch, record patterns or virtual-thread APIs here.
 * stringLengthOrZero uses instanceof String pattern matching: String -> length, other/null -> 0.
 * Explain that a record is not automatically deeply immutable when its components are mutable.
 */
public final class J24ModernJavaLab {
    public enum CommandKind { DEPOSIT, WITHDRAW }
    public static final class CommandSpec {
        public final CommandKind kind;
        public final long amount;
        public CommandSpec(CommandKind kind, long amount) {
            this.kind = kind;
            this.amount = amount;
        }
    }

    public static List<Long> runningBalances(long initialBalance, List<CommandSpec> commands) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static int stringLengthOrZero(Object value) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        long initialBalance = 100L;
        List<CommandSpec> commands = List.of(new CommandSpec(CommandKind.DEPOSIT, 50L),
                new CommandSpec(CommandKind.WITHDRAW, 30L));
        ExampleRunner.run("J24 typed commands", "initial=100; DEPOSIT 50; WITHDRAW 30", "[150, 120]",
                () -> runningBalances(initialBalance, commands));
        Object text = "java";
        ExampleRunner.run("J24 instanceof pattern", "Object containing String java", "4",
                () -> stringLengthOrZero(text));
        Object number = 17;
        ExampleRunner.run("J24 another runtime type", "Object containing Integer 17", "0",
                () -> stringLengthOrZero(number));
    }
}

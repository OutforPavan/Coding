package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J21 / P1 — Extensible pricing and observer delivery.
 * Observer is a reported broad topic; these exact pricing/notification fixtures are illustrative.
 * quoteCents supports STANDARD at 500 + 100*kilograms and EXPRESS at 1000 + 200*kilograms;
 * require kilograms>0. Implement strategies selected by a factory, with dependencies passed
 * explicitly rather than global mutable state. Return long to avoid int multiplication overflow.
 * deliveredMessages registers each distinct subscriber name once, preserves registration
 * order, publishes the event through observer callbacks, and returns the delivered
 * "subscriber:event" messages. Add your own strategy/observer types; no pattern solution is supplied.
 * Follow-up: add a third strategy without changing existing ones; discuss Builder and SOLID.
 */
public final class J21PatternsLab {
    public enum ShippingMethod { STANDARD, EXPRESS }
    public static final class ShippingRequest {
        public final ShippingMethod method;
        public final int kilograms;
        public ShippingRequest(ShippingMethod method, int kilograms) {
            this.method = method;
            this.kilograms = kilograms;
        }
    }

    public static long quoteCents(ShippingRequest request) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<String> deliveredMessages(List<String> subscriberNames, String event) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        ShippingRequest standard = new ShippingRequest(ShippingMethod.STANDARD, 3);
        ShippingRequest express = new ShippingRequest(ShippingMethod.EXPRESS, 3);
        ExampleRunner.run("J21 shipping strategy", "STANDARD, 3kg", "800", () -> quoteCents(standard));
        ExampleRunner.run("J21 second strategy", "EXPRESS, 3kg", "1600", () -> quoteCents(express));
        List<String> names = List.of("email", "audit", "email");
        String event = "created";
        ExampleRunner.run("J21 observers", "register email,audit,email; publish created",
                "[email:created, audit:created]", () -> deliveredMessages(names, event));
    }
}

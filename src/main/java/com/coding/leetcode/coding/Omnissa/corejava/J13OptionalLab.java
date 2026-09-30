package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;
import java.util.Optional;

/**
 * J13 / P0 — An explicit absent result and lazy fallback.
 * First-duplicate/Optional is a reported topic; these exact examples and helpers are practice
 * extensions. firstDuplicate returns the value whose SECOND appearance occurs earliest;
 * return Optional.empty when none exists. Null elements are excluded by the contract.
 * fallbackCalls must create a counting fallback supplier, resolve the supplied Optional
 * using orElse when eager=true or orElseGet otherwise, and return the number of fallback
 * invocations. Do not hardcode counts. Explain of, ofNullable and why unchecked get is unsafe.
 */
public final class J13OptionalLab {
    public static Optional<Integer> firstDuplicate(List<Integer> values) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static int fallbackCalls(Optional<String> value, boolean eager) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<Integer> repeated = List.of(2, 1, 3, 1, 2);
        ExampleRunner.run("J13 first repeated occurrence", "[2,1,3,1,2]", "Optional[1]",
                () -> firstDuplicate(repeated));
        List<Integer> unique = List.of(1, 2, 3);
        ExampleRunner.run("J13 no duplicate", "[1,2,3]", "Optional.empty", () -> firstDuplicate(unique));
        Optional<String> present = Optional.of("already-present");
        ExampleRunner.run("J13 lazy fallback", "present Optional, eager=false", "0",
                () -> fallbackCalls(present, false));
        ExampleRunner.run("J13 eager fallback", "present Optional, eager=true", "1",
                () -> fallbackCalls(present, true));
    }
}

package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;

/**
 * J01 / P0 — Equality and hash contracts.
 * Illustrative coding lab converted from the equality theory topic; this exact task is not
 * claimed as an Omnissa interview question. Implement UserKey equality using only userId;
 * displayName must not affect equality or hashing. Then implement the two helpers.
 * compareKeys returns [sameReference, logicallyEqual, sameHashCode]. Count unique keys
 * using a hash-based set. Null keys are not part of the fixture contract.
 */
public final class J01EqualityLab {
    public static final class UserKey {
        public final String userId;
        public final String displayName;

        public UserKey(String userId, String displayName) {
            this.userId = userId;
            this.displayName = displayName;
        }

        @Override public boolean equals(Object other) {
            throw new UnsupportedOperationException("TODO: implement method");
        }

        @Override public int hashCode() {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }

    public static List<Boolean> compareKeys(UserKey left, UserKey right) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static int countUniqueKeys(List<UserKey> keys) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        UserKey first = new UserKey("u1", "Ada");
        UserKey renamed = new UserKey("u1", "Ada Lovelace");
        UserKey second = new UserKey("u2", "Grace");
        ExampleRunner.run("J01 identity versus equality", "two distinct keys with userId=u1",
                "[false, true, true]", () -> compareKeys(first, renamed));
        ExampleRunner.run("J01 equal keys in a set", "[u1/Ada, u1/Ada Lovelace, u2/Grace]",
                "2", () -> countUniqueKeys(List.of(first, renamed, second)));
    }
}

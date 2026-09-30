package com.coding.leetcode.coding.Omnissa.dsa.hashing;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | FirstUniqueCharacter
 * Return the index of the first character appearing once, or -1. Input uses ASCII characters.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String text = "loveleetcode";
        ExampleRunner.run("First unique", text, "2", () -> firstUniqueCharacter(text));
        ExampleRunner.run("No unique", "aabb", "-1", () -> firstUniqueCharacter("aabb"));
    }

    public static int firstUniqueCharacter(String text) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement firstUniqueCharacter");
    }
}

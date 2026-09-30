package com.coding.leetcode.coding.Omnissa.dsa.hashing;

import java.util.List;
import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | GroupAnagrams
 * Group lowercase words containing identical letter counts. Ordering of groups and group members is unrestricted.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class GroupAnagrams {

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ExampleRunner.run("Anagrams", "[eat, tea, tan, ate, nat, bat]", "groups {eat, tea, ate}, {tan, nat}, {bat}; any order", () -> groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement groupAnagrams");
    }
}

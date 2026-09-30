package com.coding.leetcode.coding.Omnissa.dsa.strings;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * D02 | P0 | Find the length of the longest contiguous substring with no repeated characters.
 * <p>Problem: Find the length of the longest contiguous substring with no repeated characters.
 * <p>Contract: Non-null String; treat Java UTF-16 char values as characters; return 0 for empty input. Return the length, not a subsequence.
 * <p>Evidence: R S1; I S6. UTF-16 semantics are a practice contract. <a href="https://leetcode.com/discuss/post/8386158/omnissa-formerly-vmware-mts-2-bengaluru-7sb5a/">S1</a>, <a href="https://leetcode.com/discuss/post/8368034/">S6</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String text) {
        throw new UnsupportedOperationException("TODO: implement lengthOfLongestSubstring");
    }

    public static void main(String[] args) {
        String input = "pwwkew";
        ExampleRunner.run("D02 longest unique substring", input, "3", () -> lengthOfLongestSubstring(input));
        String repeatedOutsideWindow = "abba";
        ExampleRunner.run("D02 window boundary", repeatedOutsideWindow, "2", () -> lengthOfLongestSubstring(repeatedOutsideWindow));
        String empty = "";
        ExampleRunner.run("D02 empty input", "empty string", "0", () -> lengthOfLongestSubstring(empty));
    }
}

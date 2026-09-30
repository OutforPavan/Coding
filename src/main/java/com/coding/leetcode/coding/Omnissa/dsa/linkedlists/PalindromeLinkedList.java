package com.coding.leetcode.coding.Omnissa.dsa.linkedlists;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.ListNode;

/**
 * D22 | P2 | Determine whether a singly linked list reads identically forward and backward.
 * <p>Problem: Determine whether a singly linked list reads identically forward and backward.
 * <p>Contract: Input is acyclic, possibly null. Empty and single-node lists are palindromes. Restore the original list before returning if links are temporarily changed.
 * <p>Evidence: U S11: uncertain or duplicate-provenance report. Restoration is an explicit practice requirement. <a href="https://www.reddit.com/r/Technical_Interview/comments/1wkc1zw/sweomnissa_software_engineer_interview_experience/">S11</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        throw new UnsupportedOperationException("TODO: implement isPalindrome");
    }

    public static void main(String[] args) {
        ListNode input = ListNode.of(1, 2, 2, 1);
        ExampleRunner.run("D22 palindrome list", input.toString(), "true; original links restored", () -> isPalindrome(input));
        ListNode different = ListNode.of(1, 2);
        ExampleRunner.run("D22 not a palindrome", different.toString(), "false; original links restored", () -> isPalindrome(different));
        ListNode empty = null;
        ExampleRunner.run("D22 empty list", "null", "true", () -> isPalindrome(empty));
    }
}

package com.coding.leetcode.coding.Omnissa.dsa.linkedlists;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.ListNode;

/**
 * D07 | P0 | Reverse a singly linked list by changing its next links.
 * <p>Problem: Reverse a singly linked list by changing its next links.
 * <p>Contract: Input is an acyclic list, possibly null. Reuse the existing nodes, mutate links, and return the new head. Null returns null.
 * <p>Evidence: I S8: reverse-linked-list task; node-reuse requirement is a practice contract. <a href="https://www.reddit.com/r/leetcode/comments/1ktn2cw/omnissa_sde_interview/">S8</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        throw new UnsupportedOperationException("TODO: implement reverseList");
    }

    public static void main(String[] args) {
        ListNode input = ListNode.of(1, 2, 3, 4);
        ExampleRunner.run("D07 reverse list", input.toString(), "[4, 3, 2, 1]", () -> reverseList(input));
        ListNode single = ListNode.of(7);
        ExampleRunner.run("D07 single node", single.toString(), "[7]", () -> reverseList(single));
        ListNode empty = null;
        ExampleRunner.run("D07 empty list", "null", "null", () -> reverseList(empty));
    }
}

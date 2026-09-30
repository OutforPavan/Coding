package com.coding.leetcode.coding.Omnissa.dsa.linkedlists;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.ListNode;

/**
 * Additional DSA practice | P1 | RemoveNthNodeFromEnd
 * Remove the nth node from the end and return the head. n is one-based and guaranteed valid.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {

        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        ExampleRunner.run("Remove node", "[1,2,3,4,5], n=2", "[1, 2, 3, 5]", () -> removeNthFromEnd(head, 2));
        ExampleRunner.run("Remove only node", "[1], n=1", "null", () -> removeNthFromEnd(ListNode.of(1), 1));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement removeNthFromEnd");
    }
}

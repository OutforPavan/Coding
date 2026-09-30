package com.coding.leetcode.coding.Omnissa.dsa.linkedlists;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.ListNode;

/**
 * Additional DSA practice | P1 | LinkedListCycleDetection
 * Return whether next references contain a cycle. Do not modify nodes.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class LinkedListCycleDetection {

    public static void main(String[] args) {

        ListNode head = ListNode.of(3, 2, 0, -4);
        head.next.next.next.next = head.next;
        ExampleRunner.run("Cycle", "3->2->0->-4->node 2", "true", () -> hasCycle(head));
        ExampleRunner.run("No cycle", "1->2->null", "false", () -> hasCycle(ListNode.of(1, 2)));
    }

    public static boolean hasCycle(ListNode head) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement hasCycle");
    }
}

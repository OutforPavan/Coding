package com.coding.leetcode.coding.Omnissa.dsa.linkedlists;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.ListNode;

/**
 * Additional DSA practice | P1 | MergeTwoSortedLinkedLists
 * Merge ascending lists into one ascending list; existing nodes may be relinked.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {

        ListNode first = ListNode.of(1, 2, 4);
        ListNode second = ListNode.of(1, 3, 4);
        ExampleRunner.run("Merge lists", "[1,2,4] and [1,3,4]", "[1, 1, 2, 3, 4, 4]", () -> mergeLists(first, second));
    }

    public static ListNode mergeLists(ListNode first, ListNode second) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement mergeLists");
    }
}

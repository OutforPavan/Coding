package com.coding.leetcode.coding.Omnissa.dsa.heaps;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import com.coding.leetcode.coding.Omnissa.support.ListNode;

/**
 * Additional DSA practice | P1 | MergeKSortedLinkedLists
 * Merge k ascending linked lists, including null lists; existing nodes may be relinked.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class MergeKSortedLinkedLists {

    public static void main(String[] args) {

        ListNode[] lists = {ListNode.of(1, 4, 5), ListNode.of(1, 3, 4), ListNode.of(2, 6)};
        ExampleRunner.run("Merge k lists", "[[1,4,5],[1,3,4],[2,6]]", "[1, 1, 2, 3, 4, 4, 5, 6]", () -> mergeKLists(lists));
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement mergeKLists");
    }
}

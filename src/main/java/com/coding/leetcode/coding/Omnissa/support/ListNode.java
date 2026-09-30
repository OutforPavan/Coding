package com.coding.leetcode.coding.Omnissa.support;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/** Fixture node and display helpers, shared by linked-list exercises. */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        return dummy.next;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Set<ListNode> visited = Collections.newSetFromMap(new IdentityHashMap<>());
        ListNode node = this;
        int displayed = 0;
        while (node != null) {
            if (displayed > 0) result.append(", ");
            if (!visited.add(node)) {
                result.append("cycle to ").append(node.val);
                break;
            }
            if (displayed++ >= 100) {
                result.append("...");
                break;
            }
            result.append(node.val);
            node = node.next;
        }
        return result.append(']').toString();
    }
}

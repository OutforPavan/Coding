package com.coding.leetcode.coding.Omnissa.dsa.design;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | LruCache
 * Implement fixed-capacity cache operations. get refreshes recency; absent keys return -1. Capacity is positive.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class LruCache {
    public LruCache(int capacity) {
        // TODO: initialize your data structure.
    }

    public int get(int key) {
        throw new UnsupportedOperationException("TODO: implement get");
    }

    public void put(int key, int value) {
        throw new UnsupportedOperationException("TODO: implement put");
    }
    public static void main(String[] args) {

        LruCache cache = new LruCache(2);
        ExampleRunner.run("LRU operations", "put(1,10), put(2,20), get(1), put(3,30), get(2), get(3)", "[10, -1, 30]", () -> {
            cache.put(1, 10);
            cache.put(2, 20);
            int first = cache.get(1);
            cache.put(3, 30);
            return new int[]{first, cache.get(2), cache.get(3)};
        });
    }


}

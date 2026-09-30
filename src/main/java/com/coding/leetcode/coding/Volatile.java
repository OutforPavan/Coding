package com.coding.leetcode.coding;

import java.util.concurrent.atomic.AtomicInteger;

public class Volatile {

    private final  AtomicInteger count = new AtomicInteger(0);

        public void increment() {
          count.incrementAndGet();
        }

        public int getCount() {
            return count.get();
        }

}

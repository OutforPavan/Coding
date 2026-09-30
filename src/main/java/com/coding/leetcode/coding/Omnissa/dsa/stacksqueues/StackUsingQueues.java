package com.coding.leetcode.coding.Omnissa.dsa.stacksqueues;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * D09 | P0 | Implement an integer LIFO stack using FIFO queue operations.
 * <p>Problem: Implement an integer LIFO stack using FIFO queue operations.
 * <p>Contract: Use one or two queues; only enqueue, dequeue, front, size and emptiness checks on underlying queues. Implement push/pop/peek/size/isEmpty. Empty pop and peek throw NoSuchElementException.
 * <p>Evidence: R S4: stack using queue(s). Queue-operation restriction and empty behavior are practice choices. <a href="https://leetcode.com/discuss/post/6892873/">S4</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class StackUsingQueues {
    public StackUsingQueues() {
        // TODO: initialize queue state when implementing this exercise.
    }

    public void push(int value) {
        throw new UnsupportedOperationException("TODO: implement push");
    }

    public int pop() {
        throw new UnsupportedOperationException("TODO: implement pop");
    }

    public int peek() {
        throw new UnsupportedOperationException("TODO: implement peek");
    }

    public int size() {
        throw new UnsupportedOperationException("TODO: implement size");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("TODO: implement isEmpty");
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        ExampleRunner.run("D09 stack using queues", "push 10,20,30; pop,peek,size", "[30, 20, 2]", () -> {
            StackUsingQueues stack = new StackUsingQueues();
            for (int value : values) {
                stack.push(value);
            }
            return new int[]{stack.pop(), stack.peek(), stack.size()};
        });
        ExampleRunner.run("D09 empty queue-backed stack", "fresh stack", "true", () -> new StackUsingQueues().isEmpty());
    }
}

package com.coding.leetcode.coding.Omnissa.dsa.stacksqueues;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * D10 | P0 | Implement an integer FIFO queue using stack operations.
 * <p>Problem: Implement an integer FIFO queue using stack operations.
 * <p>Contract: Use stacks only for storage. Implement enqueue/dequeue/peek/size/isEmpty. Empty dequeue and peek throw NoSuchElementException. Be ready to explain worst-case and amortized operation costs.
 * <p>Evidence: R S4: queue using stacks; API and failure policy are practice choices. <a href="https://leetcode.com/discuss/post/6892873/">S4</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class QueueUsingStacks {
    public QueueUsingStacks() {
        // TODO: initialize stack state when implementing this exercise.
    }

    public void enqueue(int value) {
        throw new UnsupportedOperationException("TODO: implement enqueue");
    }

    public int dequeue() {
        throw new UnsupportedOperationException("TODO: implement dequeue");
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
        int first = 10;
        int second = 20;
        int third = 30;
        ExampleRunner.run("D10 interleaved queue operations", "enqueue 10,20; dequeue; enqueue 30; dequeue,peek,size", "[10, 20, 30, 1]", () -> {
            QueueUsingStacks queue = new QueueUsingStacks();
            queue.enqueue(first);
            queue.enqueue(second);
            int removedFirst = queue.dequeue();
            queue.enqueue(third);
            int removedSecond = queue.dequeue();
            return new int[]{removedFirst, removedSecond, queue.peek(), queue.size()};
        });
        ExampleRunner.run("D10 empty queue", "fresh queue", "true", () -> new QueueUsingStacks().isEmpty());
    }
}

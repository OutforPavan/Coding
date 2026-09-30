package com.coding.leetcode.coding.Omnissa.dsa.stacksqueues;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * D09 | P0 | Implement an integer LIFO stack backed by a dynamically growing array.
 * <p>Problem: Implement an integer LIFO stack backed by a dynamically growing array.
 * <p>Contract: Implement push/pop/peek/size/isEmpty. pop and peek throw NoSuchElementException when empty. Constructor capacity is positive; grow storage when full. Do not delegate stack operations to an existing Stack or Deque.
 * <p>Evidence: R S4: stack using a vector or dynamic array. Detailed API is practice scaffolding. <a href="https://leetcode.com/discuss/post/6892873/">S4</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class ArrayStack {
    public ArrayStack(int initialCapacity) {
        // TODO: allocate the backing storage when implementing this exercise.
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
        int initialCapacity = 2;
        ExampleRunner.run("D09 dynamic-array stack", "capacity=2; push 10,20,30; pop,peek,size", "[30, 20, 2]", () -> {
            ArrayStack stack = new ArrayStack(initialCapacity);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            return new int[]{stack.pop(), stack.peek(), stack.size()};
        });
        ExampleRunner.run("D09 fresh stack", "capacity=1", "true", () -> new ArrayStack(1).isEmpty());
        ExampleRunner.run("D09 empty pop", "capacity=1; pop", "NoSuchElementException after implementation", () -> new ArrayStack(1).pop());
    }
}

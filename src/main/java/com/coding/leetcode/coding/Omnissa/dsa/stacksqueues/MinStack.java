package com.coding.leetcode.coding.Omnissa.dsa.stacksqueues;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | MinStack
 * Implement push, pop, top and getMin. Empty pop/top/getMin throw NoSuchElementException.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class MinStack {
    public MinStack() {
        // TODO: initialize your data structure.
    }

    public void push(int value) {
        throw new UnsupportedOperationException("TODO: implement push");
    }

    public int pop() {
        throw new UnsupportedOperationException("TODO: implement pop");
    }

    public int top() {
        throw new UnsupportedOperationException("TODO: implement top");
    }

    public int getMin() {
        throw new UnsupportedOperationException("TODO: implement getMin");
    }
    public static void main(String[] args) {

        MinStack stack = new MinStack();
        ExampleRunner.run("Min stack", "push(-2), push(0), push(-3), min, pop, top, min", "[-3, -3, 0, -2]", () -> {
            stack.push(-2);
            stack.push(0);
            stack.push(-3);
            return new int[]{stack.getMin(), stack.pop(), stack.top(), stack.getMin()};
        });
    }


}

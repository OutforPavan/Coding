package com.coding.leetcode.coding.Omnissa.dsa.intervals;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P1 | MeetingRoomOverlap
 * Return minimum simultaneous rooms for half-open intervals [start,end). A meeting ending at t frees its room for a meeting starting at t.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class MeetingRoomOverlap {

    public static void main(String[] args) {

        int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};
        ExampleRunner.run("Meeting rooms", "[[0,30],[5,10],[15,20]]", "2", () -> minimumRooms(meetings));
        ExampleRunner.run("Touching meetings", "[[0,5],[5,10]]", "1", () -> minimumRooms(new int[][]{{0, 5}, {5, 10}}));
    }

    public static int minimumRooms(int[][] meetings) {
        // TODO: write your solution.
        throw new UnsupportedOperationException("TODO: implement minimumRooms");
    }
}

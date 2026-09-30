package com.coding.leetcode.coding.Omnissa.dsa.graphs;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;

/**
 * D03 | P0 | Return a valid order for completing courses subject to prerequisites.
 * <p>Problem: Return a valid order for completing courses subject to prerequisites.
 * <p>Contract: numCourses is nonnegative. Each pair [course, prerequisite] requires prerequisite first; IDs are in [0, numCourses). Include isolated vertices. Return any valid order, or an empty array for a cycle. Do not mutate prerequisites.
 * <p>Evidence: R S1: Course Schedule II and dependency ordering. <a href="https://leetcode.com/discuss/post/8386158/omnissa-formerly-vmware-mts-2-bengaluru-7sb5a/">S1</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class CourseScheduleII {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        throw new UnsupportedOperationException("TODO: implement findOrder");
    }

    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        ExampleRunner.run("D03 dependency order", "4 courses, " + Arrays.deepToString(prerequisites),
                "[0, 1, 2, 3] or [0, 2, 1, 3]", () -> findOrder(numCourses, prerequisites));
        int[][] cycle = {{0, 1}, {1, 0}};
        ExampleRunner.run("D03 cycle", "2 courses, " + Arrays.deepToString(cycle), "[]", () -> findOrder(2, cycle));
        int[][] none = {};
        ExampleRunner.run("D03 isolated course", "1 course, no prerequisites", "[0]", () -> findOrder(1, none));
    }
}

package com.coding.leetcode.coding.Omnissa.dsa.graphs;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;

/**
 * D23 | P2 | Find a person known by everybody else who knows nobody else.
 * <p>Problem: Find a person known by everybody else who knows nobody else.
 * <p>Contract: Input is a non-null square boolean matrix: knows[a][b] says whether a knows b. Ignore diagonal entries. Return the celebrity index, or -1 if none exists. An empty matrix returns -1; a one-person group returns 0. Do not mutate the matrix.
 * <p>Evidence: U S11: uncertain or duplicate-provenance report. Matrix API is an illustrative practice contract. <a href="https://www.reddit.com/r/Technical_Interview/comments/1wkc1zw/sweomnissa_software_engineer_interview_experience/">S11</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class CelebrityProblem {
    public static int findCelebrity(boolean[][] knows) {
        throw new UnsupportedOperationException("TODO: implement findCelebrity");
    }

    public static void main(String[] args) {
        boolean[][] knows = {{false, true, true}, {false, false, true}, {false, false, false}};
        ExampleRunner.run("D23 celebrity exists", Arrays.deepToString(knows), "2", () -> findCelebrity(knows));
        boolean[][] cycle = {{false, true, false}, {false, false, true}, {true, false, false}};
        ExampleRunner.run("D23 no celebrity", Arrays.deepToString(cycle), "-1", () -> findCelebrity(cycle));
        boolean[][] single = {{false}};
        ExampleRunner.run("D23 one person", "[[false]]", "0", () -> findCelebrity(single));
    }
}

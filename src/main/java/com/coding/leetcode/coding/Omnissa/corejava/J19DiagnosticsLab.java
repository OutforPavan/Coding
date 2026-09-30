package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;
import java.util.Map;

/**
 * J19 / P1 — Inspect synthetic thread observations.
 * Illustrative diagnostics lab, not a benchmark or an assertion about real CPU usage.
 * countStates counts all supplied observations by Thread.State.name and returns keys sorted.
 * repeatedRunnableThreads returns sorted thread names with at least threshold RUNNABLE
 * observations at the same topFrame (threshold must be positive). Other observations do not
 * count toward that frame's threshold. Do not infer CPU percentage from RUNNABLE alone.
 * Explain what thread dumps, JFR, heap dumps and allocation/GC metrics would add to an
 * investigation of high CPU, growing live heap or latency spikes. No live process is sampled.
 */
public final class J19DiagnosticsLab {
    public static final class ThreadObservation {
        public final String threadName;
        public final Thread.State state;
        public final String topFrame;
        public ThreadObservation(String threadName, Thread.State state, String topFrame) {
            this.threadName = threadName;
            this.state = state;
            this.topFrame = topFrame;
        }
    }

    public static Map<String, Integer> countStates(List<ThreadObservation> observations) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static List<String> repeatedRunnableThreads(List<ThreadObservation> observations, int threshold) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<ThreadObservation> observations = List.of(
                new ThreadObservation("worker-1", Thread.State.RUNNABLE, "Cache.lookup"),
                new ThreadObservation("worker-2", Thread.State.WAITING, "Queue.take"),
                new ThreadObservation("worker-1", Thread.State.RUNNABLE, "Cache.lookup"),
                new ThreadObservation("worker-3", Thread.State.RUNNABLE, "Parser.read"));
        ExampleRunner.run("J19 state counts", "3 RUNNABLE samples, 1 WAITING sample",
                "{RUNNABLE=3, WAITING=1}", () -> countStates(observations));
        int threshold = 2;
        ExampleRunner.run("J19 candidates for further inspection", "worker-1 twice at Cache.lookup; threshold=2",
                "[worker-1]; an inspection candidate, not proof of high CPU",
                () -> repeatedRunnableThreads(observations, threshold));
    }
}

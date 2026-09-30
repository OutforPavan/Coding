package com.coding.leetcode.coding.Omnissa.corejava;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

import java.util.List;
import java.util.Map;

/**
 * J17 / P1 — Summarize supplied GC observations safely.
 * Illustrative analysis lab; no call to System.gc, no allocation stress and no timing test.
 * summarize returns a key-sorted map containing eventCount, maxPauseMillis,
 * totalPauseMillis and totalReclaimedBytes. Each sample has nonnegative values and
 * afterBytes <= beforeBytes; reject invalid samples. Empty input gives zero for all metrics.
 * Values in these fixtures fit long. Compute from the supplied measurements, not runtime
 * assumptions. Discuss why two events do not prove a leak, and why application throughput
 * cannot be calculated without the observation interval and other required measurements.
 */
public final class J17GcAnalysisLab {
    public static final class GcSample {
        public final long pauseMillis;
        public final long beforeBytes;
        public final long afterBytes;
        public GcSample(long pauseMillis, long beforeBytes, long afterBytes) {
            this.pauseMillis = pauseMillis;
            this.beforeBytes = beforeBytes;
            this.afterBytes = afterBytes;
        }
    }

    public static Map<String, Long> summarize(List<GcSample> samples) {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<GcSample> samples = List.of(new GcSample(8, 1000, 700), new GcSample(12, 1100, 900));
        ExampleRunner.run("J17 supplied GC metrics", "pause/before/after: 8/1000/700, 12/1100/900",
                "{eventCount=2, maxPauseMillis=12, totalPauseMillis=20, totalReclaimedBytes=500}",
                () -> summarize(samples));
        List<GcSample> empty = List.of();
        ExampleRunner.run("J17 empty observations", "[]",
                "{eventCount=0, maxPauseMillis=0, totalPauseMillis=0, totalReclaimedBytes=0}",
                () -> summarize(empty));
    }
}

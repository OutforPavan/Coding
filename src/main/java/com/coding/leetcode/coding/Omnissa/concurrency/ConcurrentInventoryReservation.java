package com.coding.leetcode.coding.Omnissa.concurrency;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.time.Duration;
import java.util.List;

/**
 * C05 (P0): Two buyers reserve the last item in an in-memory, single-JVM inventory.
 * Maps T04 (P0), synchronized monitor choice/reentrancy, and T08 (P0), atomics/CAS.
 *
 * <p>Reject invalid quantities. Never oversell. The same request ID and quantity
 * returns the original outcome without deducting twice; reuse of an ID with a
 * different quantity is invalid. Make availability, deduction and idempotency
 * bookkeeping one consistent operation. Implement synchronized and atomic-state
 * variants and compare their costs under contention. Explain instance versus
 * static monitors and why LongAdder is unsuitable for a strict inventory bound.
 *
 * <p>This exercise coordinates only threads sharing this JVM instance. It is NOT
 * a database transaction or a cross-process/multi-service-instance solution.
 * As a discussion extension, describe database conditional updates, version checks
 * or row locks, transaction boundaries, durable idempotency and retry behavior.
 *
 * <p>Gate two buyers together; do not assert which buyer wins. Join using a finite
 * deadline, interrupt remaining workers, and shut down owned executors in finally.
 */
public final class ConcurrentInventoryReservation {
    public record Request(String requestId, int units) { }
    public record Report(int successfulDistinctRequests, int remainingUnits,
                         boolean retriesPreserveOutcome, boolean noOversell) { }

    public static final class Inventory {
        private final int initialUnits;

        public Inventory(int initialUnits) {
            this.initialUnits = initialUnits;
        }

        public boolean reserve(String requestId, int units) {
            throw new UnsupportedOperationException("TODO: implement method");
        }

        public boolean reserveUsingSynchronized(String requestId, int units) {
            throw new UnsupportedOperationException("TODO: implement method");
        }

        public boolean reserveUsingAtomicState(String requestId, int units) {
            throw new UnsupportedOperationException("TODO: implement method");
        }

        public int remainingUnits() {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }

    public static Report solution(int initialUnits, List<Request> requests,
                                  Duration timeout) throws InterruptedException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        List<Request> requests = List.of(new Request("buyer-A", 1), new Request("buyer-B", 1));
        ExampleRunner.run("C05/T04/T08 Last-item reservation",
                "initialUnits=1; buyer-A and buyer-B each request 1; retry both request IDs",
                "successfulDistinctRequests=1, remainingUnits=0, retriesPreserveOutcome=true, noOversell=true",
                () -> solution(1, requests, Duration.ofSeconds(2)));
    }
}

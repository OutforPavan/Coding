package com.coding.leetcode.coding.Omnissa.concurrency;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

/**
 * T20 (P1): Prevent ThreadLocal request context from leaking across pooled tasks.
 *
 * <p>Use one reusable executor worker for two sequential requests. The first runs
 * with user alice; the next has no user and must observe an empty context. Remove
 * request-local state in finally, including exceptional and cancelled paths.
 * Specify whether nested context scopes restore an outer value or are prohibited.
 * Do not assume setting context on a submitting thread populates a worker thread.
 *
 * <p>Add an exceptional first-request case and verify the second request remains
 * clean. Bound Future.get, shutdown and termination waits by one deadline. The
 * owner always shuts down/awaits the executor in finally; no task survives main.
 */
public final class RequestContextIsolation {
    public record Report(List<Optional<String>> observedUsers, boolean secondRequestClean,
                         boolean executorTerminated) { }

    public static <T> T withUser(String user, Callable<T> action) throws Exception {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static Optional<String> currentUser() {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void clear() {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static Report solution(String firstUser, Duration timeout) throws Exception {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        ExampleRunner.run("T20 ThreadLocal context on a reused worker",
                "single executor thread; request 1 user=alice; request 2 user=absent",
                "observedUsers=[Optional[alice], Optional.empty], secondRequestClean=true, executorTerminated=true",
                () -> solution("alice", Duration.ofSeconds(2)));
    }
}

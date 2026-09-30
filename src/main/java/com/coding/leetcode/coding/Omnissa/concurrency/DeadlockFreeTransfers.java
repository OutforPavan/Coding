package com.coding.leetcode.coding.Omnissa.concurrency;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.time.Duration;

/**
 * T11 (P0): Transfer funds concurrently without deadlock or lost updates.
 *
 * <p>Each account has a unique ID and a nonnegative balance. A transfer must debit
 * and credit atomically, reject invalid amounts, and never expose a negative
 * balance. Handle same-account transfers explicitly. Compare consistent lock
 * ordering with a deadline-bounded tryLock approach. Explain the four necessary
 * deadlock conditions and distinguish deadlock, starvation and livelock.
 *
 * <p>Run two workers transferring in opposite directions. Verify conservation and
 * termination, not a deliberately created deadlock. Inspect a supplied/static
 * thread dump for diagnosis as a discussion extension. Apply a finite deadline to
 * acquisition and joins; release every acquired lock in finally and interrupt/join
 * workers during cleanup. Do not leave blocked threads or run an unsafe demo.
 */
public final class DeadlockFreeTransfers {
    public record Report(long totalBalance, long balanceA, long balanceB,
                         int successfulTransfers, boolean allWorkersTerminated) { }

    public static final class Account {
        private final long id;
        private long balance;

        public Account(long id, long initialBalance) {
            this.id = id;
            this.balance = initialBalance;
        }

        public long balance() {
            throw new UnsupportedOperationException("TODO: implement method");
        }
    }

    public static boolean transfer(Account from, Account to, long amount,
                                   Duration timeout) throws InterruptedException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static Report solution(long initialBalancePerAccount, int transfersEachWay,
                                  Duration timeout) throws InterruptedException {
        throw new UnsupportedOperationException("TODO: implement method");
    }

    public static void main(String[] args) {
        ExampleRunner.run("T11 Deadlock-free account transfers",
                "A=1000, B=1000; 2 workers, 100 transfers each way, amount=1; deadline=2 seconds",
                "totalBalance=2000, balanceA=1000, balanceB=1000, successfulTransfers=200, allWorkersTerminated=true",
                () -> solution(1000, 100, Duration.ofSeconds(2)));
    }
}

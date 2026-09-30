package com.coding.leetcode.coding.Omnissa.dsa.practical;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.List;

/**
 * D25 | P2 | Find the minimum number of transfers needed to settle balances from a list of payments.
 * <p>Problem: Find the minimum number of transfers needed to settle balances from a list of payments.
 * <p>Contract: Illustrative debt-settlement variant: each Transaction(fromId,toId,amount) records a positive integer payment between distinct participant IDs. Net balances must be settled exactly using arbitrary participant-to-participant transfers; amounts and accumulated balances fit long. Return minimum transfer count, not transferred amount. Empty or already balanced input returns 0. Do not modify input.
 * <p>Evidence: R S13 mentions minimizing transactions but gives insufficient detail. Debt settlement is an illustrative practice problem only, not an identified original or evidence for LC 465. <a href="https://www.glassdoor.com/Interview/Omnissa-Interview-Questions-E10115166.htm">S13</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class MinimumDebtSettlementTransactions {
    public record Transaction(int fromId, int toId, long amount) { }

    public static int minimumTransfers(List<Transaction> transactions) {
        throw new UnsupportedOperationException("TODO: implement minimumTransfers");
    }

    public static void main(String[] args) {
        List<Transaction> transactions = List.of(new Transaction(0, 1, 10L), new Transaction(2, 0, 5L));
        ExampleRunner.run("D25 illustrative debt settlement", transactions.toString(), "2", () -> minimumTransfers(transactions));
        List<Transaction> balanced = List.of(new Transaction(0, 1, 5L), new Transaction(1, 0, 5L));
        ExampleRunner.run("D25 already balanced", balanced.toString(), "0", () -> minimumTransfers(balanced));
        List<Transaction> empty = List.of();
        ExampleRunner.run("D25 no payments", "[]", "0", () -> minimumTransfers(empty));
    }
}

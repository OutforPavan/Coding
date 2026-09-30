package com.coding.leetcode.coding.Omnissa.dsa.dp;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.Arrays;

/**
 * D14 | P1 | Find the minimum number of coins needed to make an exact amount.
 * <p>Problem: Find the minimum number of coins needed to make an exact amount.
 * <p>Contract: Non-null array of positive integer coin denominations; unlimited use of each denomination; amount is nonnegative. Return -1 if impossible and 0 for amount 0. Input remains unchanged.
 * <p>Evidence: R S1, C# track: Coin Change. This is the minimum-coins practice equivalent. <a href="https://leetcode.com/discuss/post/8386158/omnissa-formerly-vmware-mts-2-bengaluru-7sb5a/">S1</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class CoinChange {
    public static int minimumCoins(int[] coins, int amount) {
        throw new UnsupportedOperationException("TODO: implement minimumCoins");
    }

    public static void main(String[] args) {
        int[] coins = {1, 3, 4};
        int amount = 6;
        ExampleRunner.run("D14 non-greedy example", Arrays.toString(coins) + ", amount=" + amount, "2", () -> minimumCoins(coins, amount));
        int[] impossible = {2};
        ExampleRunner.run("D14 impossible amount", "coins=[2], amount=3", "-1", () -> minimumCoins(impossible, 3));
        int[] none = {};
        ExampleRunner.run("D14 zero amount", "coins=[], amount=0", "0", () -> minimumCoins(none, 0));
    }
}

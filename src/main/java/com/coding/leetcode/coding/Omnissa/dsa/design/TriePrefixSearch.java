package com.coding.leetcode.coding.Omnissa.dsa.design;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;

/**
 * Additional DSA practice | P2 | TriePrefixSearch
 * Insert lowercase ASCII words, test complete-word membership and test prefixes. Empty prefix matches any trie.
 * This is a preparation extension, not a recovered exact Omnissa question.
 * Add your approach, time complexity and space complexity after implementing.
 */
public class TriePrefixSearch {
    public TriePrefixSearch() {
        // TODO: initialize your data structure.
    }

    public void insert(String word) {
        throw new UnsupportedOperationException("TODO: implement insert");
    }

    public boolean search(String word) {
        throw new UnsupportedOperationException("TODO: implement search");
    }

    public boolean startsWith(String prefix) {
        throw new UnsupportedOperationException("TODO: implement startsWith");
    }
    public static void main(String[] args) {

        TriePrefixSearch trie = new TriePrefixSearch();
        ExampleRunner.run("Trie", "insert apple; search apple; search app; startsWith app", "[true, false, true]", () -> {
            trie.insert("apple");
            return new boolean[]{trie.search("apple"), trie.search("app"), trie.startsWith("app")};
        });
    }


}

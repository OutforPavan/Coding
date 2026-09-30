package com.coding.leetcode.coding;

import java.util.concurrent.ConcurrentHashMap;

public class CustomSingleton {
    private static volatile CustomSingleton instance;

    private CustomSingleton(){

    }

    public static CustomSingleton getInstance(){

        if(instance == null) {
            synchronized (CustomSingleton.class) {
                if (instance == null) {
                    instance = new CustomSingleton();
                }
            }
        }
        return instance;
    }
    private final ConcurrentHashMap<String, Integer> stock =
            new ConcurrentHashMap<>();

    public boolean reserve(String sku) {
        synchronized (stock.getClass()) {
            if (stock.get(sku) > 0) {
                stock.put(sku, stock.get(sku) - 1);
                return true;
            }
        }
        return false;
    }

}

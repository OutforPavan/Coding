package com.coding.leetcode.coding;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
       Map<String,String> map = new HashMap<>();
       map.put("Pavan","Success");
       map.put("Agrim","InProgress");
       map.put("Ayan","Success");
       map.put("Prince","InProgress");

     Map<String,String> result =  map.entrySet().stream().
               filter(e->e.getValue().equals("Success")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

       result.forEach((k,v)->{System.out.println(k+":"+v);});

    }
}

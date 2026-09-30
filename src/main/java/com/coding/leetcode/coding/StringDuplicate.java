package com.coding.leetcode.coding;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicate {
    public static void main(String[] args){
        String s = "programming";
       //for removing duplicate using java 8 we need to convert the string to stream of character.
        //once stream of character created then we can collect the characters by group. and
        //grouping will be based on character and with unique filter.

    Map<Character,Long> frequency  =  s.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(
                     Function.identity(),
                     LinkedHashMap::new,
                     Collectors.counting()
                ));

    List<Character> duplicate = frequency.entrySet()
            .stream()
            .filter(characterLongEntry -> characterLongEntry.getValue()>1)
            .map(characterLongEntry -> characterLongEntry.getKey())
            .collect(Collectors.toList());

    System.out.println(duplicate);
    }
}

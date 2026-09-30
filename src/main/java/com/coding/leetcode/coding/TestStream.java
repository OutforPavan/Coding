package com.coding.leetcode.coding;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] agrs){
        ArrayList<String> l = new ArrayList<String>();
        l.add("A");
        l.add("AA");
        l.add("AAA");
        l.add("AAAA");
        l.add("AAAAA");
        System.out.println(l);

        List<String> sortedList = l.stream().
                sorted((l1, l2)->
                        ((l1.length()<l2.length())? -1:
                                (l1.length()>l2.length())? 1:
                                        (l1.compareTo(l2))))
                .collect(Collectors.toList());
        System.out.println(sortedList);

    }
}

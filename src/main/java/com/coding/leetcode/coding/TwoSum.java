package com.coding.leetcode.coding;

import java.util.HashMap;

public class TwoSum {
    int[] twoSum(int[] nums, int target){
        int[] ans  = new int[2];
        HashMap<Integer,Integer> hashTable = new HashMap<>();
        for(int i= 0;i<nums.length;i++){
            int findNumber  = target-nums[i];
            if(hashTable.containsKey(findNumber)){
                ans[0] = hashTable.get(findNumber);
                ans[1] = i;
                return ans;
            }
           if(! hashTable.containsKey(nums[i])){
                hashTable.put(nums[i],i);
            }
        }
return ans;
    }
}

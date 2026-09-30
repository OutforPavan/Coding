package com.coding.leetcode.coding;

import java.util.HashMap;

public class BinarySearchBoundry {
    //Time: expected O(n).
    //Auxiliary space: O(u), where u is the number of distinct values—O(n) in the worst case.
    //Requirement missed: O(log n) time.
    int firstIndexUsingHashMap(int[] nums, int target){
        HashMap<Integer,Integer> hasTable  = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!hasTable.containsKey(nums[i])){
                hasTable.put(nums[i],i);
            }
        }
        return hasTable.containsKey(target)?hasTable.get(target):-1;
    }

//TimeComplexity
int firstIndexUsingBinarySearch(int[] nums, int target){
        int start = 0;
        int end  = nums.length-1;
        int mid = (start+end)/2;
        while(true){
            if(nums[mid]==target){

            }
        }


}
}

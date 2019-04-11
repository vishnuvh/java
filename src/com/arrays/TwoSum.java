package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    //0(n) & 0(n)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i< nums.length;i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] input = new int[] {2,7,11,15};
        int[] output = twoSum(input,9);
        System.out.println(Arrays.toString(output));

    }
}

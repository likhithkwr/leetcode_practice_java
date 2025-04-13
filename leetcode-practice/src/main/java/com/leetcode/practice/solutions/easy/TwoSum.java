package com.leetcode.practice.solutions.easy;

import java.util.HashMap;

// Problem 3 Leetcode 1
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer, Integer> numsMap = new HashMap<>(nums.length);
		
		
		
		for (int i=0; i < nums.length; i++) {
			int subtractedValue = target - nums[i];
			
			if (numsMap.containsKey(subtractedValue)) {
				return new int[] {numsMap.get(subtractedValue), i};
			}
			
			numsMap.put(nums[i], i);
		}
		
		return new int[] {};
        
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum ts = new TwoSum();

        int[] result1 = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Result1: [" + result1[0] + ", " + result1[1] + "]");

        int[] result2 = ts.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Result2: [" + result2[0] + ", " + result2[1] + "]");

        int[] result3 = ts.twoSum(new int[]{3, 3}, 6);
        System.out.println("Result3: [" + result3[0] + ", " + result3[1] + "]");

	}

}

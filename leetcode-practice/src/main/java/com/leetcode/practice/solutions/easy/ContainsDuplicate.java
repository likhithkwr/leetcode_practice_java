package com.leetcode.practice.solutions.easy;

import java.util.HashSet;

// Leetcode Problem 217
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
    	HashSet<Integer> seen = new HashSet<>(nums.length);
        for (int num: nums) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();

        int[] test1 = {1, 2, 3, 1};
        System.out.println(cd.containsDuplicate(test1)); // true

        int[] test2 = {1, 2, 3, 4};
        System.out.println(cd.containsDuplicate(test2)); // false

        int[] test3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(cd.containsDuplicate(test3)); // true
    }
}
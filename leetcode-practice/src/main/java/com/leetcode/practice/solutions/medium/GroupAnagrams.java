package com.leetcode.practice.solutions.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
	
	public ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
		
		HashMap<String, ArrayList<String>> res = new HashMap<>();
		
		for(String str: strs) {
			
			int[] count = new int[26];
			
			for(char c: str.toCharArray()) {
				count[c - 'a']++;
			}
			String key = Arrays.toString(count);
			res.putIfAbsent(key, new ArrayList<>());
			res.get(key).add(str);
			
		}
		
		return new ArrayList<>(res.values());
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GroupAnagrams ga = new GroupAnagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<ArrayList<String>> result = ga.groupAnagrams(input);
        System.out.println(result);
        for (ArrayList<String> group : result) {
            System.out.println(group);
        }

	}

}

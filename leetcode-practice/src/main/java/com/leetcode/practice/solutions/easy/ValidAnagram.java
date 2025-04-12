package com.leetcode.practice.solutions.easy;

import java.util.HashMap;

// Leetcode 242

public class ValidAnagram {
	
public boolean isAnagram(String s, String t) {
	
	if (s.length() != t.length()) return false;
	
	int[] count = new int[26]; // only lowercase a-z

	for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++; // increment for s
        count[t.charAt(i) - 'a']--; // decrement for t
    }
	
	for (int c : count) {
        if (c != 0) return false;
    }
	
	return true;
	
    }

public boolean isAnagramHashmap(String s, String t) {
    if (s.length() != t.length()) return false;

    HashMap<Character, Integer> map = new HashMap<>();

    // Count characters from s
    for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    // Subtract characters from t
    for (char c : t.toCharArray()) {
        if (!map.containsKey(c)) return false;

        map.put(c, map.get(c) - 1);
        if (map.get(c) == 0) {
            map.remove(c);
        }
    }

    return map.isEmpty();
}

public static void main(String[] args) {
    ValidAnagram va = new ValidAnagram();

    System.out.println(va.isAnagram("anagram", "nagaram")); // true
    System.out.println(va.isAnagram("rat", "car"));         // false
    System.out.println(va.isAnagram("a", "a"));
}

}

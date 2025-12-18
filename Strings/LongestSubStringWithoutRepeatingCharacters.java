// LeetCode #3: Longest Substring Without Repeating Characters
// Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Time Complexity: O(n), Space: O(n)
// Approach: Sliding window using HashSet to track current substring.

import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

// Last updated: 9/15/2025, 7:25:10 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set = new HashSet<>();
        // int maxLen = 0;
        // int left = 0;

        // for (int right = 0; right < s.length(); right++) {
        //     while (set.contains(s.charAt(right))) {
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     maxLen = Math.max(maxLen, right - left + 1);
        // }

        // return maxLen;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break;
                }
                set.add(c);
                count = Math.max(count, set.size());
            }
        }

        return count;

    }

}
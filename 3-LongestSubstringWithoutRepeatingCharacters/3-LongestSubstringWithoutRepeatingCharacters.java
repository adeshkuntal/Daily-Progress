// Last updated: 2/10/2026, 8:02:58 PM
1import java.util.HashSet;
2
3class Solution {
4    public int lengthOfLongestSubstring(String s) {
5        HashSet<Character> set = new HashSet<>();
6        int left = 0;
7        int ans = 0;
8
9        for (int right = 0; right < s.length(); right++) {
10            while (set.contains(s.charAt(right))) {
11                set.remove(s.charAt(left));
12                left++;
13            }
14            set.add(s.charAt(right));
15            ans = Math.max(ans, right - left + 1);
16        }
17
18        return ans;
19    }
20}
21
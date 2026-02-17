// Last updated: 2/17/2026, 9:37:44 PM
1
2
3class Solution {
4    public String minWindow(String s, String t) {
5
6        // frequency map of characters in t
7        HashMap<Character, Integer> map = new HashMap<>();
8        for (int i = 0; i < t.length(); i++) {
9            char ch = t.charAt(i);
10            map.put(ch, map.getOrDefault(ch, 0) + 1);
11        }
12
13        int uniqueCount = map.size();   // number of unique characters to match
14        int minLen = Integer.MAX_VALUE; // minimum window length
15        int windowStart = 0;
16        int startIdx = -1;              // starting index of minimum window
17
18        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
19
20            // expansion
21            char ch = s.charAt(windowEnd);
22            if (map.containsKey(ch)) {
23                map.put(ch, map.get(ch) - 1);
24                if (map.get(ch) == 0) {
25                    uniqueCount--;
26                }
27            }
28
29            // shrinking
30            while (uniqueCount == 0) {
31
32                // find window length
33                int len = windowEnd - windowStart + 1;
34                if (len < minLen) {
35                    minLen = len;
36                    startIdx = windowStart;
37                }
38
39                ch = s.charAt(windowStart);
40                if (map.containsKey(ch)) {
41                    map.put(ch, map.get(ch) + 1);
42                    if (map.get(ch) > 0) {
43                        uniqueCount++;
44                    }
45                }
46                windowStart++;
47            }
48        }
49
50        // if no valid window found
51        if (startIdx == -1) {
52            return "";
53        }
54
55        // return minimum window substring
56        return s.substring(startIdx, startIdx + minLen);
57    }
58}
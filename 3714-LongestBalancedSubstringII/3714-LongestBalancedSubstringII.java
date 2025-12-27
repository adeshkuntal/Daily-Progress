// Last updated: 12/27/2025, 7:20:07 PM
1// import java.util.*;
2
3// class Solution {
4//     public int longestBalanced(String s) {
5//         int count = 1;
6//         for(int i = 0; i < s.length(); i++){
7//             for(int j = i + 1; j < s.length(); j++){
8//                 String str = s.substring(i, j + 1);
9//                 if(balanced(str)){
10//                     count = Math.max(count, str.length());
11//                 }
12//             }
13//         }
14//         return count;
15//     }
16
17//     public static boolean balanced(String str){
18//         HashMap<Character, Integer> map = new HashMap<>();
19//         for(int i = 0; i < str.length(); i++){
20//             map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
21//         }
22
23//         int freq = -1;
24//         for(int val : map.values()){
25//             if(freq == -1){
26//                 freq = val;
27//             } else if(freq != val){
28//                 return false;
29//             }
30//         }
31//         return true;
32//     }
33// }
34
35class Solution {
36    public int longestBalanced(String s) {
37        int n = s.length();
38
39        // Case 1 :- Single longest repeating character
40        int maxLen = 1,len = 1;
41        for(int i=1;i<n;i++) {
42            if(s.charAt(i) == s.charAt(i-1)) len++;
43            else len = 1;
44            maxLen = Math.max(maxLen,len);
45        }
46
47        // Case 2 :- Consider the pairs and skip 1 character
48        int len1 = solve(s,'a','b','c');
49        int len2 = solve(s,'a','c','b');
50        int len3 = solve(s,'b','c','a');
51        maxLen = Math.max(maxLen,Math.max(len1,Math.max(len2,len3)));
52
53        // Case 3 :- Consider all the 3 characters
54        HashMap<String,Integer> hashMap = new HashMap<>();
55        hashMap.put("0#0",-1);
56        int[] cnt = new int[3];
57
58        for(int i=0;i<n;i++) {
59            cnt[s.charAt(i) - 'a']++;
60
61            int cnt_ab = cnt[0] - cnt[1];
62            int cnt_ac = cnt[0] - cnt[2];
63
64            String key = cnt_ab + "#" + cnt_ac;
65            if(hashMap.containsKey(key)){
66                maxLen = Math.max(maxLen,i - hashMap.get(key));
67            }
68            else hashMap.put(key,i);
69        }
70
71        return maxLen;
72    }
73    public int solve(String s,char ch1,char ch2,char resetChar) {
74        int maxLen = 0;
75        
76        String[] segments = s.split(String.valueOf(resetChar), -1);
77        for(String segment : segments) {
78            if(segment.isEmpty()) continue;
79
80            HashMap<Integer,Integer> hashMap = new HashMap<>();
81            hashMap.put(0,-1);
82            int sum = 0;
83
84            for(int i=0;i<segment.length();i++) {
85                char ch = segment.charAt(i);
86                if(ch == ch1) sum++;
87                else if(ch == ch2) sum--;
88
89
90                if(hashMap.containsKey(sum)){
91                    maxLen = Math.max(maxLen,i - hashMap.get(sum));
92                }
93                else{
94                    hashMap.put(sum,i);
95                }
96            }
97        }
98
99        return maxLen;
100    }
101}
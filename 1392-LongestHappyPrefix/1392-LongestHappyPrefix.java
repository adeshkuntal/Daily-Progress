// Last updated: 3/16/2026, 9:29:00 PM
1// class Solution {
2//     public String longestPrefix(String s) {
3//         String ans = "";
4//         for(int i=1; i<s.length(); i++){
5//             String pre = s.substring(0,i);
6//             String suff = s.substring(s.length()-i);
7//             if(pre.equals(suff) && pre.length() > ans.length()){
8//                 ans = pre;
9//             }
10//         }
11//         return ans;
12//     }
13// }
14
15
16class Solution {
17    public String longestPrefix(String s) {
18        int n = s.length();
19        int[] lps = new int[n];
20
21        int len = 0;
22        int i = 1;
23
24        while(i < n){
25            if(s.charAt(i) == s.charAt(len)){
26                len++;
27                lps[i] = len;
28                i++;
29            }
30            else{
31                if(len != 0){
32                    len = lps[len-1];
33                }
34                else{
35                    lps[i] = 0;
36                    i++;
37                }
38            }
39        }
40
41        return s.substring(0, lps[n-1]);
42    }
43}
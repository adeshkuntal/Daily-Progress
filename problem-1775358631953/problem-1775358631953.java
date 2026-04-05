// Last updated: 4/5/2026, 8:40:31 AM
1class Solution {
2    public int mirrorFrequency(String s) {
3        int[] f = new int[36];
4        for(char c : s.toCharArray()){
5            if(c >= 'a' && c<= 'z'){
6                f[c-'a']++;
7            }
8            else {
9                f[26 + (c-'0')]++;
10            } 
11        }
12
13        int ans = 0;
14        for(int i=0; i<26; i++){
15            int j = 25-i;
16            if(i <= j){
17                ans += Math.abs(f[i] - f[j]);
18            }
19        }
20        for(int i=0; i<10; i++){
21            int j = 9-i;
22            if(i <= j){
23                ans += Math.abs(f[26+i] - f[26+j]);
24            }
25        }
26
27        return ans;
28    }
29}
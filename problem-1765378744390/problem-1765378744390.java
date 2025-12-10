// Last updated: 12/10/2025, 8:29:04 PM
1class Solution {
2    public int countPermutations(int[] complexity) {
3        long ans = 1; 
4        int n = complexity.length;
5        int mod = 1000000007;
6        for(int i=1; i<n; i++){
7            if(complexity[i] <= complexity[0]){
8                return 0;
9            }
10        }
11        for(int i=1; i<n; i++){
12            ans = (ans * i) % mod;
13        }
14        return (int)ans;
15    }
16}
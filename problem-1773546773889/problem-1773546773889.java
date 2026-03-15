// Last updated: 3/15/2026, 9:22:53 AM
1class Solution {
2    public long countCommas(long n) {
3        long ans = 0;
4        long start = 1000;
5        int commas = 1;
6        while(start <= n){
7            long end = start*1000-1;
8            long count = Math.min(n,end)-start+1;
9
10            if(count > 0){
11                ans += count*commas;
12            }
13
14            start *= 1000;
15            commas++;
16        }
17
18        return ans;
19    }
20}
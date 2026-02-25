// Last updated: 2/25/2026, 8:07:28 PM
1class Solution {
2    public long minimumTime(int[] time, int t) {
3        Arrays.sort(time);
4        long l = 1;
5        long r = (long)t*time[0];
6        while(l < r){
7            long mid = l+(r-l)/2;
8            long count = 0;
9            for(int i=0; i<time.length; i++){
10                count += mid/time[i];
11            }
12            if(count >= t){
13                r = mid;
14            }
15            else{
16                l = mid+1;
17            }
18
19        }
20
21        return l;
22    }
23}
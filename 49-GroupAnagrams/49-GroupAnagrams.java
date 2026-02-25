// Last updated: 2/25/2026, 8:01:01 PM
1class Solution {
2    public long minimumTime(int[] time, int totalTrips) {
3        Arrays.sort(time);
4
5        long lo = 1;
6        long hi = (long)time[0] * totalTrips;
7        while(lo < hi){
8            long mid = lo + (hi - lo) / 2;
9            long count = 0;
10            for (int t : time) {
11                count += mid / t;
12            }
13            if(count >= totalTrips){
14                hi = mid;
15            }
16            else{
17                lo = mid + 1;
18            }
19        }
20
21        return lo;
22    }
23}
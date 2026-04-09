// Last updated: 4/9/2026, 11:51:45 AM
1class Solution {
2    public int[] corpFlightBookings(int[][] bookings, int n) {
3        int[] res = new int[n+1];
4        for(int[] b : bookings){
5            int f = b[0];
6            int l = b[1];
7            int seat = b[2];
8            res[f-1] += seat;
9            res[l] += -seat;
10        }
11        int[] prefix = new int[n];
12        prefix[0] = res[0];
13        for(int i=1; i<n; i++){
14            prefix[i] = prefix[i-1]+res[i];
15        }
16
17        return prefix;
18    }
19}
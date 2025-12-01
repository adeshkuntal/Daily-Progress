// Last updated: 12/1/2025, 10:15:14 PM
1class Solution {
2
3    boolean possible(int[] batteries, long mid_minutes, int n) {
4        long target_minutes = n * mid_minutes;
5        long sum = 0;
6
7        for (int i = 0; i < batteries.length; i++) {
8            sum += Math.min(batteries[i], mid_minutes);
9        }
10
11        return sum >= target_minutes;
12    }
13
14    public long maxRunTime(int n, int[] batteries) {
15
16        long l = Arrays.stream(batteries).min().getAsInt();
17
18        long sum_total_minutes = 0;
19        for (int m : batteries) {
20            sum_total_minutes += m;
21        }
22
23        long r = sum_total_minutes / n;
24        long result = 0;
25
26        while (l <= r) {
27            long mid = l + (r - l) / 2;
28
29            if (possible(batteries, mid, n)) {
30                result = mid;
31                l = mid + 1;
32            } else {
33                r = mid - 1;
34            }
35        }
36
37        return result;
38    }
39}
40
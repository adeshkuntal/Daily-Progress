// Last updated: 12/2/2025, 9:21:12 PM
1class Solution {
2    public int countTrapezoids(int[][] points) {
3        int n = points.length;
4        int MOD = 1000000007;
5        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
6
7        long res = 0;
8        long total = 0;
9        for (int i = 0, j; i < n; i = j){
10            j = i + 1;
11            while (j < n && points[i][1] == points[j][1]){
12                j++;
13            }
14            long count = j - i;
15            long lines = count * (count - 1) / 2;
16            res = (res + total * lines) % MOD;
17            total = (total + lines) % MOD;
18        }
19        return (int)res;
20    }
21}
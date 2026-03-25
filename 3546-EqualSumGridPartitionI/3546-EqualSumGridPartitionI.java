// Last updated: 3/25/2026, 8:38:21 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5
6        long total = 0;
7        for(int i=0;i<n;i++){
8            for(int j=0;j<m;j++){
9                total += grid[i][j];
10            }
11        }
12
13        long sum = 0;
14        for(int i=0;i<n;i++){
15            for(int j=0;j<m;j++){
16                sum += grid[i][j];
17            }
18            if(sum * 2 == total) return true;
19        }
20
21        sum = 0;
22        for(int j=0;j<m;j++){
23            for(int i=0;i<n;i++){
24                sum += grid[i][j];
25            }
26            if(sum * 2 == total) return true;
27        }
28
29        return false;
30    }
31}
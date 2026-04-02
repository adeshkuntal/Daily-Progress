// Last updated: 4/2/2026, 11:25:29 AM
1// class Solution {
2//     public int maximumAmount(int[][] grid) {
3//         return fn(grid, 0, 0, 2);
4//     }
5
6//     public int fn(int[][] grid, int i, int j, int enc) {
7//         if (i >= grid.length || j >= grid[0].length)
8//             return Integer.MIN_VALUE;
9
10//         if (i == grid.length - 1 && j == grid[0].length - 1) {
11//             if (grid[i][j] < 0 && enc > 0) return 0;
12//             return grid[i][j];
13//         }
14
15//         if (grid[i][j] < 0) {
16//             if (enc > 0) {
17//                 int skip = Math.max(fn(grid, i, j + 1, enc - 1),fn(grid, i + 1, j, enc - 1));
18//                 int take = grid[i][j] + Math.max(fn(grid, i, j + 1, enc),fn(grid, i + 1, j, enc));
19//                 return Math.max(skip, take);
20//             } 
21//             else {
22//                 return grid[i][j] + Math.max(fn(grid, i, j + 1, enc),fn(grid, i + 1, j, enc));
23//             }
24//         }
25//         return grid[i][j] + Math.max(fn(grid, i, j + 1, enc),fn(grid, i + 1, j, enc));
26//     }
27// }
28
29
30
31class Solution {
32    public int maximumAmount(int[][] grid) {
33        int n = grid.length;
34        int m = grid[0].length;
35        int[][][] dp = new int[n][m][3];
36
37        for(int i=0;i<n;i++){
38            for(int j=0;j<m;j++){
39                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
40            }
41        }
42
43        return fn(grid, 0, 0, 2, dp);
44    }
45
46    public int fn(int[][] grid, int i, int j, int enc, int[][][] dp) {
47        if(i >= grid.length || j >= grid[0].length)
48            return Integer.MIN_VALUE;
49
50        if(i == grid.length-1 && j == grid[0].length-1){
51            if(grid[i][j] < 0 && enc > 0) return 0;
52            return grid[i][j];
53        }
54
55        if(dp[i][j][enc] != Integer.MIN_VALUE)
56            return dp[i][j][enc];
57
58        int ans;
59
60        if(grid[i][j] < 0){
61            if(enc > 0){
62                int skip = Math.max(fn(grid, i, j+1, enc-1, dp), fn(grid, i+1, j, enc-1, dp));
63                int take = grid[i][j] + Math.max(fn(grid, i, j+1, enc, dp), fn(grid, i+1, j, enc, dp));
64                ans = Math.max(skip, take);
65            } else {
66                ans = grid[i][j] + Math.max(fn(grid, i, j+1, enc, dp), fn(grid, i+1, j, enc, dp));
67            }
68        } else {
69            ans = grid[i][j] + Math.max(fn(grid, i, j+1, enc, dp), fn(grid, i+1, j, enc, dp));
70        }
71
72        return dp[i][j][enc] = ans;
73    }
74}
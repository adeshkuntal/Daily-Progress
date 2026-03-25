// Last updated: 3/25/2026, 8:38:35 PM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        long total = 0;
4        int n = grid.length;
5        int m = grid[0].length;
6
7        for(int i=0; i<n; i++){
8            for(int j=0; j<m; j++){
9                total += grid[i][j];
10            }
11        }
12
13        int row = 0;
14        long currRow = 0;
15        while(row < n){
16            for(int j=0; j<m; j++){
17                currRow += grid[row][j];
18            }
19            if(total - currRow == currRow){
20                return true;
21            }
22            row++;
23        }
24
25        int col = 0;
26        long currCol = 0;
27        while(col < m){
28            for(int j=0; j<n; j++){
29                currCol += grid[j][col];
30            }
31            if(total - currCol == currCol){
32                return true;
33            }
34            col++;
35        }
36
37        return false;
38    }
39}
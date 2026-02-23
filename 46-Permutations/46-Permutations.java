// Last updated: 2/23/2026, 9:48:19 PM
1class Solution {
2    public int uniquePathsIII(int[][] grid) {
3        int empty = 0;
4        int startRow = 0, startCol = 0;
5
6        for(int i=0; i<grid.length; i++){
7            for(int j=0; j<grid[0].length; j++){
8                if(grid[i][j] != -1){
9                    empty++;
10                }
11                if(grid[i][j] == 1){
12                    startRow = i;
13                    startCol = j;
14                }
15            }
16        }
17
18        return dfs(grid, startRow, startCol, empty);
19    }
20    
21    public int dfs(int[][] grid,int i,int j,int empty){
22        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length || grid[i][j] == -1){
23            return 0;
24        }
25
26        if(grid[i][j] == 2){
27            if(empty == 1){
28                return 1;
29            } else {
30                return 0;
31            }
32        }
33
34        int temp = grid[i][j];
35        grid[i][j] = -1;
36
37        int total = 0;
38
39        total += dfs(grid,i - 1, j, empty - 1);
40        total += dfs(grid,i, j + 1, empty - 1);
41        total += dfs(grid,i + 1, j, empty - 1);
42        total += dfs(grid,i, j - 1, empty - 1);
43
44        grid[i][j] = temp;
45
46        return total;
47    }
48}
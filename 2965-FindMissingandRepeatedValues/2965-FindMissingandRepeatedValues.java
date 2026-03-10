// Last updated: 3/10/2026, 12:30:49 PM
1import java.util.*;
2
3class Solution {
4    public int[] findMissingAndRepeatedValues(int[][] grid) {
5        HashSet<Integer> set = new HashSet<>();
6        int a = -1;
7        int b = -1;
8        int n = grid.length;
9
10        for(int i=0; i<n; i++){
11            for(int j=0; j<n; j++){
12                if(set.contains(grid[i][j])){
13                    a = grid[i][j];
14                }
15                set.add(grid[i][j]);
16            }
17        }
18
19        for(int i=1; i<=n*n; i++){
20            if(!set.contains(i)){
21                b = i;
22                break;
23            }
24        }
25
26        return new int[]{a,b};
27    }
28}
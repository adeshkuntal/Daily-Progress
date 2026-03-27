// Last updated: 3/27/2026, 3:08:12 PM
1class Solution {
2    public boolean areSimilar(int[][] mat, int k) {
3        int n = mat.length;
4        int m = mat[0].length;
5
6        int[][] temp = new int[n][m];
7
8        for(int i = 0; i < n; i++){
9            for(int j = 0; j < m; j++){
10                if(i % 2 == 0){
11                    temp[i][j] = mat[i][(j + k) % m];
12                } else {
13                    temp[i][j] = mat[i][(j - k % m + m) % m];
14                }
15            }
16        }
17
18        for(int i = 0; i < n; i++){
19            for(int j = 0; j < m; j++){
20                if(mat[i][j] != temp[i][j]){
21                    return false;
22                }
23            }
24        }
25
26        return true;
27    }
28}
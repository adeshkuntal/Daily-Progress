// Last updated: 3/13/2026, 7:40:32 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        boolean[] row = new boolean[m];
7        boolean[] col = new boolean[n];
8
9        for(int i=0;i<m;i++){
10            for(int j=0;j<n;j++){
11                if(matrix[i][j] == 0){
12                    row[i] = true;
13                    col[j] = true;
14                }
15            }
16        }
17
18        for(int i=0;i<m;i++){
19            for(int j=0;j<n;j++){
20                if(row[i] || col[j]){
21                    matrix[i][j] = 0;
22                }
23            }
24        }
25    }
26}
// Last updated: 3/24/2026, 12:41:18 PM
1class Solution {
2    public int[][] constructProductMatrix(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        int mod = 12345;
6        
7        int size = n * m;
8        int[] arr = new int[size];
9        
10        int idx = 0;
11        for(int i=0;i<n;i++){
12            for(int j=0;j<m;j++){
13                arr[idx++] = grid[i][j] % mod;
14            }
15        }
16        
17        int[] prefix = new int[size];
18        int[] suffix = new int[size];
19        
20        prefix[0] = 1;
21        for(int i=1;i<size;i++){
22            prefix[i] = (prefix[i-1] * arr[i-1]) % mod;
23        }
24        
25        suffix[size-1] = 1;
26        for(int i=size-2;i>=0;i--){
27            suffix[i] = (suffix[i+1] * arr[i+1]) % mod;
28        }
29        
30        int[][] ans = new int[n][m];
31        idx = 0;
32        
33        for(int i=0;i<n;i++){
34            for(int j=0;j<m;j++){
35                ans[i][j] = (prefix[idx] * suffix[idx]) % mod;
36                idx++;
37            }
38        }
39        
40        return ans;
41    }
42}
// Last updated: 12/11/2025, 9:04:36 PM
1class Solution {
2    public int countCoveredBuildings(int n, int[][] buildings) {
3        int[] top = new int[n+1];
4        int[] bottom = new int[n+1];
5        int[] left = new int[n+1];
6        int[] right = new int[n+1];
7
8        Arrays.fill(top,Integer.MAX_VALUE);
9        Arrays.fill(left,Integer.MAX_VALUE);
10
11        for(int i = 0; i < buildings.length ; i++) {
12            int x = buildings[i][0];
13            int y = buildings[i][1];
14
15            top[x] = Math.min(top[x],y);
16            bottom[x] = Math.max(bottom[x],y);
17            left[y] = Math.min(left[y],x);
18            right[y] = Math.max(right[y],x);
19        }
20
21        int count = 0;
22
23        for(int i = 0 ; i < buildings.length ; i++) {
24            int x = buildings[i][0];
25            int y = buildings[i][1];
26            if(top[x] < y && bottom[x] > y && left[y] < x && right[y] > x) {
27                count++;
28            }
29        }
30
31        return count;
32    }
33}
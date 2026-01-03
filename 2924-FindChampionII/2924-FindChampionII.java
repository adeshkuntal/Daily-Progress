// Last updated: 1/3/2026, 10:16:17 PM
1class Solution {
2    public int findChampion(int n, int[][] edges) {
3        int[] indegree = new int[n];
4        for(int[] e : edges){
5            indegree[e[1]]++;
6        }
7
8        int count = 0;
9        int ans = 0;
10        for(int i=0; i<n; i++){
11            if(indegree[i] == 0){
12                count++;
13                ans = i;
14            }
15        }
16
17        if(count == 1){
18            return ans;
19        }
20        else{
21            return -1;
22        }
23    }
24    
25
26}
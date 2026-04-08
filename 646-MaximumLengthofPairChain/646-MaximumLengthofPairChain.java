// Last updated: 4/8/2026, 11:24:35 AM
1class Solution {
2    public int findLongestChain(int[][] pair) {
3        Arrays.sort(pair, (a, b) -> a[1] - b[1]);
4        int ans = 1;
5        int start = pair[0][0];
6        int end = pair[0][1];
7        for(int i=1; i<pair.length; i++){
8            if(pair[i][0] > end){
9                end = pair[i][1];
10                ans++;
11            }
12        }
13        return ans;
14    }
15}
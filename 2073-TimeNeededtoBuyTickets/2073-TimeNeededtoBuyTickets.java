// Last updated: 1/28/2026, 2:14:52 PM
1class Solution {
2    public int timeRequiredToBuy(int[] t, int k) {
3        int x = t[k];
4        int sum = 0;
5
6        for(int i = 0; i < t.length; i++){
7            if(i <= k){
8                sum += Math.min(t[i], x);
9            } else {
10                sum += Math.min(t[i], x - 1);
11            }
12        }
13
14        return sum;
15    }
16}
17
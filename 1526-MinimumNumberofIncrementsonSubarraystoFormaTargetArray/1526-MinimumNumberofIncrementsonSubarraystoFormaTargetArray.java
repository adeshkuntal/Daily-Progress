// Last updated: 1/20/2026, 11:26:43 AM
1class Solution {
2    public int minNumberOperations(int[] target) {
3        int a = target[0];
4        for(int i=1; i<target.length; i++){
5            if(target[i] > target[i-1]){
6                a += target[i] - target[i-1];
7            }
8        }
9
10        return a;
11    }
12}
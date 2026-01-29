// Last updated: 1/29/2026, 5:09:22 PM
1class Solution {
2    public int jump(int[] nums) {
3        int i = 0;
4        int pos = 0;
5        int end = 0;
6        int jump = 0;
7        while(i < nums.length-1){
8            pos = Math.max(pos,i+nums[i]);
9            if(i==end){
10                jump++;
11                end = pos;
12            }
13            i++;
14        }
15
16        return jump;
17    }
18}
19
20
21
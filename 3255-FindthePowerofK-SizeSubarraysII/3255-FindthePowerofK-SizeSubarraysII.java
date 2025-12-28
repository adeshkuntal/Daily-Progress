// Last updated: 12/28/2025, 1:15:00 PM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        int n=nums.length;
4        int res[]=new int[n-k+1];
5        int cons=1;
6        if(k==1){
7             return nums;
8        }
9        for (int i=1;i<n;i++){
10            if(nums[i]==nums[i-1]+1){
11                cons++;
12            }
13            else{
14                cons=1;
15            }
16            if(i>=k-1){
17                if(cons>=k){
18                    res[i-k+1]=nums[i];
19                }
20                else{
21                    res[i-k+1]=-1;
22                }
23            }}
24        return res;
25    }
26}
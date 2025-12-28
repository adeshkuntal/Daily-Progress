// Last updated: 12/28/2025, 12:37:31 PM
1class Solution {
2    public int minimumSubarrayLength(int[] nums, int k) {
3        int min = nums.length+1;
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<=nums.length;j++){
6                if(check(i,j,k,nums)){
7                    min = Math.min(min,(j-i));
8                }
9            }
10        }
11        return min == nums.length+1 ? -1 : min;
12    }
13    public boolean check(int st,int en, int k,int[] nums){
14        int OR =0;
15        for(int i=st;i<en;i++){
16            OR |= nums[i];
17        }
18        return OR >=k? true:false;
19    }
20}
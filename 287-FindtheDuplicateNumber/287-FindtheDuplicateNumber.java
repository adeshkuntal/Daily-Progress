// Last updated: 2/6/2026, 9:13:27 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n = nums.length;
4        int i = 0;
5        while(i < n){
6            int correct = nums[i]-1;
7            if(nums[i] != nums[correct]){
8                int temp = nums[i];
9                nums[i] = nums[correct];
10                nums[correct] = temp;
11            }
12            else{
13                i++;
14            }
15        }
16        int ans = 0;
17        for(int j=0; j<n; j++){
18            if(nums[j] != j+1){
19                ans = nums[j];
20            }
21        }
22        return ans;
23    }
24}
// Last updated: 3/2/2026, 8:21:40 PM
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int n = nums.size();
4        int[] ans = new int[n];
5        Arrays.fill(ans, -1);
6
7        for(int j = 0; j < n; j++){
8            int target = nums.get(j);
9
10            for(int i = 0; i <= target; i++){
11                if((i | (i + 1)) == target){
12                    ans[j] = i;
13                    break;
14                }
15            }
16        }
17
18        return ans;
19    }
20}
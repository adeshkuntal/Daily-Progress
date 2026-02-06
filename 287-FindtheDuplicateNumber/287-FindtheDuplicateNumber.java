// Last updated: 2/6/2026, 9:30:13 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int i = 0;
5        while (i < n) {
6            int correct = nums[i] - 1;
7            if (nums[i] != nums[correct]) {
8                int temp = nums[i];
9                nums[i] = nums[correct];
10                nums[correct] = temp;
11            } else {
12                i++;
13            }
14        }
15
16        int[] ans = new int[2];
17        for (int j = 0; j < n; j++) {
18            if (nums[j] != j + 1) {
19                ans[0] = nums[j];
20                ans[1] = j + 1;
21                break;
22            }
23        }
24        return ans;
25    }
26}
27
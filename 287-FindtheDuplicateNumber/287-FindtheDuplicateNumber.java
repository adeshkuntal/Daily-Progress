// Last updated: 2/6/2026, 9:36:39 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n = nums.length;
4        int i = 0;
5
6        while (i < n) {
7            int correct = nums[i] - 1;
8            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
9                int temp = nums[i];
10                nums[i] = nums[correct];
11                nums[correct] = temp;
12            } else {
13                i++;
14            }
15        }
16
17        for (int j = 0; j < n; j++) {
18            if (nums[j] != j + 1) {
19                return j + 1;
20            }
21        }
22
23        return n + 1;
24    }
25}
26
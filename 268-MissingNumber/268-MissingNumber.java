// Last updated: 2/5/2026, 10:03:04 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int i = 0;
4
5        while (i < nums.length) {
6            int correct = nums[i];
7
8            if (nums[i] < nums.length && nums[i] != nums[correct]) {
9                int temp = nums[i];
10                nums[i] = nums[correct];
11                nums[correct] = temp;
12            } else {
13                i++;
14            }
15        }
16
17        for (int j = 0; j < nums.length; j++) {
18            if (nums[j] != j) {
19                return j;
20            }
21        }
22
23        return nums.length;
24    }
25}
26
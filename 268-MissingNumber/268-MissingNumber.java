// Last updated: 2/5/2026, 10:10:38 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findDisappearedNumbers(int[] nums) {
5        List<Integer> ans = new ArrayList<>();
6
7        int i = 0;
8        while (i < nums.length) {
9            int correct = nums[i] - 1;
10
11            if (nums[i] != nums[correct]) {
12                int temp = nums[i];
13                nums[i] = nums[correct];
14                nums[correct] = temp;
15            } else {
16                i++;
17            }
18        }
19
20        for (int j = 0; j < nums.length; j++) {
21            if (nums[j] != j + 1) {
22                ans.add(j + 1);
23            }
24        }
25
26        return ans;
27    }
28}
29
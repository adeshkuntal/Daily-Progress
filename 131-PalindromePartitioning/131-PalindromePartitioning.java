// Last updated: 2/20/2026, 10:13:20 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> permute(int[] nums) {
5        List<List<Integer>> res = new ArrayList<>();
6        find_per(nums, res, new ArrayList<>(), new boolean[nums.length]);
7        return res;
8    }
9
10    public static void find_per(int[] nums, List<List<Integer>> res, List<Integer> temp, boolean[] used) {
11        if (temp.size() == nums.length) {
12            res.add(new ArrayList<>(temp));
13            return;
14        }
15
16        for (int i = 0; i < nums.length; i++) {
17            if (used[i]){
18                continue;
19            }
20            used[i] = true;
21            temp.add(nums[i]);
22            find_per(nums, res, temp, used);
23            used[i] = false;
24            temp.remove(temp.size() - 1);
25        }
26    }
27}
// Last updated: 10/6/2025, 2:17:47 PM
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        find_per(nums, res, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }

    public static void find_per(int[] nums, List<List<Integer>> res, List<Integer> temp, boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]){
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            find_per(nums, res, temp, used);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}

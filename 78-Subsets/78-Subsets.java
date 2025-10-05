// Last updated: 10/5/2025, 7:14:17 PM
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        findSubset(nums, res, new ArrayList<>(), 0);
        return res;
    }

    public static void findSubset(int[] nums, List<List<Integer>> res, List<Integer> l, int idx) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[idx]);
        findSubset(nums, res, l, idx + 1);
        l.remove(l.size() - 1); 
        findSubset(nums, res, l, idx + 1);
    }
}

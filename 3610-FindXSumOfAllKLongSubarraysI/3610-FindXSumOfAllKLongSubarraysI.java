// Last updated: 11/22/2025, 1:17:19 PM
import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }

            List<int[]> list = new ArrayList<>();
            for (int key : map.keySet()) {
                list.add(new int[]{key, map.get(key)});
            }

            Collections.sort(list, (a, b) -> {
                if (b[1] == a[1]) return b[0] - a[0];
                return b[1] - a[1];
            });

            HashSet<Integer> keep = new HashSet<>();
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                keep.add(list.get(j)[0]);
            }

            int sum = 0;
            for (int j = i; j < i + k; j++) {
                if (keep.contains(nums[j])) sum += nums[j];
            }

            ans[i] = sum;
        }

        return ans;
    }
}

// Last updated: 9/28/2025, 1:33:26 PM
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }

        for (int i = k; i < n; i++) {
            res.add(nums[dq.peekFirst()]);

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);
        }

        res.add(nums[dq.peekFirst()]);

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}

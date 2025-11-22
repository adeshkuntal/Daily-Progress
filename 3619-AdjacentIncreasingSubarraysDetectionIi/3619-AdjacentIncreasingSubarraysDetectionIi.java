// Last updated: 11/22/2025, 1:17:17 PM
import java.util.*;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int i = 0;
        int result = 0;
        int prev = 0;

        while (i < n) {
            int start = i;

            while (i + 1 < n && nums.get(i) < nums.get(i + 1)) {
                i++;
            }
            
            int curr = i - start + 1;
            result = Math.max(result, Math.max(curr / 2, Math.min(curr, prev)));
            prev = curr;
            i++;
        }

        return result;
    }
}

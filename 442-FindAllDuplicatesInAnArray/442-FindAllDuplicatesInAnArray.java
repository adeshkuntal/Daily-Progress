// Last updated: 8/4/2025, 6:55:26 PM
import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int count = 0;
        int a = nums[0];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (a == nums[i]) {
                count++;
                if (count == 2) { 
                    l.add(a);
                }
            } else {
                a = nums[i];
                count = 1;
            }
        }

        return l;
    }
}

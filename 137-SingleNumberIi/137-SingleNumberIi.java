// Last updated: 8/4/2025, 6:57:18 PM
import java.util.Arrays;

class Solution { 
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int count = 1;
        int ans = -1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == a) {
                count++;
            } else {
                if(count == 1) {
                    ans = a;
                    break;
                }
                a = nums[i];
                count = 1;
            }
        }

        if(count == 1) {
            ans = a;
        }

        return ans;
    }
}

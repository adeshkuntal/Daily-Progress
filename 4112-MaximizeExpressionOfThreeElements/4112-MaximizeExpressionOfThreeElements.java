// Last updated: 11/22/2025, 1:17:03 PM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int x : nums){
            if(x > max1){
                max2 = max1;
                max1 = x;
            }
            else if(x > max2){
                max2 = x;
            }
            if(x < min){
                min = x;
            }
        }

        return max1 + max2 - min;
    }
}
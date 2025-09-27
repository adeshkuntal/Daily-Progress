// Last updated: 9/27/2025, 1:24:32 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int curr = nums[0]*nums[1]*nums[2];
        for(int i=0; i<n; i++){
            int left = i+1;
            int right = n - 1;
            while(left < right){
                int prod = nums[i]*nums[left]*nums[right];
                curr = Math.max(prod,curr);

                if(curr < prod){
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return curr;
    }
}
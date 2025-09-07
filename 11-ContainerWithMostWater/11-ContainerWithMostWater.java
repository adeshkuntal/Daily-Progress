// Last updated: 9/7/2025, 12:17:53 PM
class Solution {
    public int maxArea(int[] height) {
        // Time Complexity - O(n^2)

        // int area = 0;
        // for(int i=0; i<height.length; i++){
        //     for(int j=i; j<height.length; j++){
        //         int ans = (j-i) * Math.min(height[i],height[j]);
        //         if(ans>area){
        //             area = ans;
        //         }
        //     }
        // }
        // return area;


        // Time Complexity - O(n)
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        for(int i=0; i<height.length; i++){
            int res = (right - left) * Math.min(height[left], height[right]);
            if(res>area){
                area = res;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return area;
    }
}
// Last updated: 9/29/2025, 2:13:12 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            int left = 0;
            int right = grid[0].length - 1;
            while(left <= right) {
                int mid = left + (right - left)/2;
                if(grid[i][mid] >= 0){
                    left = mid+1;
                }
                else {
                    count += (right - mid + 1);
                    right = mid - 1;
                }
            }
        }

        return count;
    }
}
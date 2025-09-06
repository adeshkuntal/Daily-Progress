// Last updated: 9/6/2025, 8:11:23 PM
class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int w = 0;
        int h = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            w = j - i;
            h = Math.min(height[i], height[j]);
            int r = w * h;
            if (area < r) {
                area = r;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return area;
    }
}

// Last updated: 8/21/2025, 11:15:25 AM
class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] height = new int[m][n];
        
       
        for (int j = 0; j < n; j++) {
            height[0][j] = mat[0][j];
            for (int i = 1; i < m; i++) {
                height[i][j] = (mat[i][j] == 0) ? 0 : height[i-1][j] + 1;
            }
        }

        int count = 0;

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (height[i][j] > 0) {
                    int minHeight = height[i][j];
                    for (int k = j; k >= 0; k--) {
                        if (height[i][k] == 0) break;
                        minHeight = Math.min(minHeight, height[i][k]);
                        count += minHeight;
                    }
                }
            }
        }

        return count;
    }
}

// Last updated: 8/4/2025, 6:53:17 PM
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
        
        for (int j = 0; j < n; j++)
            for (int i = 0; i < n; i++)
                colMax[j] = Math.max(colMax[j], grid[i][j]);

        int total = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                total += Math.min(rowMax[i], colMax[j]) - grid[i][j];

        return total;
    }
}

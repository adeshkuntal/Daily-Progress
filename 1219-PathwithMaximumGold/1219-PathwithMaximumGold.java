// Last updated: 10/7/2025, 11:05:26 AM
class Solution {
    public int getMaximumGold(int[][] grid) {
        int max = 0;

        for(int row = 0; row < grid.length; row++) {
            for(int col = 0; col < grid[0].length; col++) {
                if(grid[row][col] == 0) {
                    continue;
                }else {
                    max = Math.max(dfs(row, col, grid), max);
                }
            }
        }
        return max;
    }
    public int dfs(int row, int col, int[][] grid) {
        
        if(row >= grid.length || row < 0 || col >= grid[0].length || col < 0 || grid[row][col] == 0) {
            return 0;
        }
        int curr = grid[row][col];
        grid[row][col] = 0;
        int a = curr + Math.max(

            Math.max(dfs(row - 1, col, grid), dfs(row, col + 1, grid)), 
            Math.max(dfs(row + 1, col, grid), dfs(row, col - 1, grid))

        );

        grid[row][col] = curr;
        return a;
    }
}
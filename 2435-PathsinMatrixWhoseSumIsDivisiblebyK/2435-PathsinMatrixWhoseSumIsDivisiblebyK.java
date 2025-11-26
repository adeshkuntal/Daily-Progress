// Last updated: 11/26/2025, 12:27:13 PM
class Solution {
    int[][][] dp;
    int mod = 1000000007;

    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n][k];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int r=0;r<k;r++){
                    dp[i][j][r] = -1;
                }
            }
        }
        return findPath(grid,0,0,k,0);
    }

    public int findPath(int[][] grid,int i,int j,int k,int sum){
        if(i>=grid.length || j>=grid[0].length){
            return 0;
        }

        sum = (sum + grid[i][j]) % k;

        if(i==grid.length-1 && j==grid[0].length-1){
            return sum % k == 0 ? 1 : 0;
        }

        if(dp[i][j][sum] != -1){
            return dp[i][j][sum];
        }

        long down = findPath(grid,i+1,j,k,sum);
        long right = findPath(grid,i,j+1,k,sum);

        dp[i][j][sum] = (int)((down + right) % mod);
        return dp[i][j][sum];
    }
}

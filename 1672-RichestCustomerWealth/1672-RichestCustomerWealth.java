// Last updated: 9/29/2025, 2:19:47 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int x = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<accounts[0].length; j++){
                sum +=accounts[i][j];
                
            }
            x = Math.max(sum,x);
        }

        return x;
    }
}
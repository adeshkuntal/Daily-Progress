// Last updated: 8/4/2025, 6:50:20 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] ans = new int[accounts.length];
        for(int i=0; i< accounts.length; i++){
            int count = 0;
            for(int j=0; j< accounts[0].length; j++){
                count+=accounts[i][j];
            }
            ans[i] = count;
        }

        int max = ans[0];
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] > max) {
                max = ans[i];
            }
        }

        return max;
    }
}
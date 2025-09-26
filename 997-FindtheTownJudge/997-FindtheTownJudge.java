// Last updated: 9/26/2025, 8:32:14 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0){
            return 1;
        }

        int[] t_Scores = new int[n + 1]; 
        for (int[] t : trust) {
            t_Scores[t[0]]--; 
            t_Scores[t[1]]++; 
        }
        for (int i = 1; i <= n; i++) {
            if (t_Scores[i] == n - 1){
                return i;
            }
        }

        return -1;
    }
}
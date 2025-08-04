// Last updated: 8/4/2025, 6:52:27 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) return 1;

        int[] trustScores = new int[n + 1]; 
        for (int[] t : trust) {
            trustScores[t[0]]--; 
            trustScores[t[1]]++; 
        }
        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) return i; 
        }

        return -1;
    }
}
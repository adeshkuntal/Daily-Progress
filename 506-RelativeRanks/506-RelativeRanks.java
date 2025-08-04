// Last updated: 8/4/2025, 6:54:55 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];

        int[] sorted = Arrays.copyOf(score, score.length);
        Arrays.sort(sorted);

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                if (score[i] == sorted[j]) {
                    int rank = sorted.length - j;
                    if (rank == 1) ans[i] = "Gold Medal";
                    else if (rank == 2) ans[i] = "Silver Medal";
                    else if (rank == 3) ans[i] = "Bronze Medal";
                    else ans[i] = String.valueOf(rank);
                    break;
                }
            }
        }
        return ans;
    }
}
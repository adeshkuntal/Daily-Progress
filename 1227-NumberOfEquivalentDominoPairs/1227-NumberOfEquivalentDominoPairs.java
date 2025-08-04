// Last updated: 8/4/2025, 6:51:50 PM
class Solution {
    public int numEquivDominoPairs(int[][] arr) {
        int[] count = new int[100];
        int pairs = 0;

        for (int[] domino : arr) {
            int a = domino[0], b = domino[1];
            int key = Math.min(a, b) * 10 + Math.max(a, b);

            pairs += count[key];
            count[key]++;
        }

        return pairs;
    }
}
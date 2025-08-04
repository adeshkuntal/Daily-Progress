// Last updated: 8/4/2025, 6:51:57 PM
class Solution {
    public int[] distributeCandies(int cand, int n) {
        int[] ans = new int[n];
        int a = 0;
        for (int i = 1; cand > 0; i++) {
            if (cand >= i) {
                ans[a] += i;
                cand -= i;
            } else {
                ans[a] += cand;
                cand = 0;
            }
            if (a == n - 1) {
                a = 0;
            } else {
                a++;
            }
        }
        return ans;
    }
}

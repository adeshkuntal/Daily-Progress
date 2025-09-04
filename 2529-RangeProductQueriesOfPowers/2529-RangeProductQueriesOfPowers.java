// Last updated: 9/4/2025, 7:16:06 PM
class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int MOD = 1_000_000_007;
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            if ((n & (1 << i)) != 0) {
                powers.add(1 << i);
            }
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            long product = 1;
            for (int j = left; j <= right; j++) {
                product = (product * powers.get(j)) % MOD;
            }
            ans[i] = (int) product;
        }

        return ans;
    }
}

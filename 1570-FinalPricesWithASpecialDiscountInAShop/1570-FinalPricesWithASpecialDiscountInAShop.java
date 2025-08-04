// Last updated: 8/4/2025, 6:51:06 PM
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            boolean found = false;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    ans[i] = prices[i] - prices[j];
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans[i] = prices[i];
            }
        }

        return ans;
    }
}
// Last updated: 8/4/2025, 6:50:39 PM
class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
         for (int i = 0; i <= n - m * k; i++) {
            boolean match = true;

            for (int j = 0; j < m * k; j++) {
                if (arr[i + j] != arr[i + j % m]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }
}
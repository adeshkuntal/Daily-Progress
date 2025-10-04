// Last updated: 10/4/2025, 3:28:03 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            Arrays.fill(result, 0);
            return result;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = Math.abs(k);
            int idx = i;

            for (int j = 1; j <= count; j++) {
                if (k > 0) {
                    idx = (i + j) % n;
                } else {
                    idx = (i - j + n) % n;
                }
                sum += code[idx];
            }

            result[i] = sum;
        }

        return result;
    }
}
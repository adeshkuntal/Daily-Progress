// Last updated: 9/9/2025, 8:43:07 PM
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int index = 0;
        for (int i = 1; i <= n / 2; i++) {
            res[index++] = i;
            res[index++] = -i;
        }
        if (n % 2 != 0) {
            res[index] = 0;
        }
        return res;
    }
}

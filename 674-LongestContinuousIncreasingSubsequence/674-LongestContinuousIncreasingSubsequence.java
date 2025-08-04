// Last updated: 8/4/2025, 6:54:08 PM
class Solution {
    public int findLengthOfLCIS(int[] num) {
        int count = 1;
        int max = 1;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[i + 1]) {
                count += 1;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        return max;
    }
}
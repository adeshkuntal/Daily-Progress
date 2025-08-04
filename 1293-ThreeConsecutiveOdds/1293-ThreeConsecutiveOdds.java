// Last updated: 8/4/2025, 6:51:36 PM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean ans = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                ans = true;
                break;
            }
        }
        return ans;
    }
}
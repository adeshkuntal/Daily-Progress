// Last updated: 8/4/2025, 6:53:42 PM
class Solution {
    public int dominantIndex(int[] arr) {
        int max_v = 0;
        int sec_max = 0;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_v) {
                max_v = arr[i];
                ans = i; 
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sec_max && arr[i] < max_v) {
                sec_max = arr[i];
            }
        }
        int r = max_v / 2;
        if (sec_max <= r) {
            return ans;
        } else {
            return -1;
        }
    }
}
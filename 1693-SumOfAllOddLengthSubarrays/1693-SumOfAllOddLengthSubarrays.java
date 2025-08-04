// Last updated: 8/4/2025, 6:50:38 PM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end += 2) { 
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
            }
        }

        return sum;
    }
}
// Last updated: 9/26/2025, 8:00:34 PM
import java.util.*;

class Solution {
    public int threeSumClosest(int[] arr, int t) {
        Arrays.sort(arr);
        int current = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (Math.abs(sum - t) < Math.abs(current - t)) {
                    current = sum;
                }

                if (sum < t) {
                    left++;
                } else if (sum > t) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return current;
    }
}

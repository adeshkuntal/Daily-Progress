// Last updated: 8/4/2025, 6:52:36 PM
class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                maxIndex = i;
            } else {
                break;
            }
        }

        if (maxIndex == 0 || maxIndex == arr.length - 1) {
            return false;
        }

        for (int i = maxIndex + 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
// Last updated: 8/4/2025, 6:52:19 PM
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
        if (totalSum % 3 != 0) {
            return false;
        }
        
        int targetSum = totalSum / 3;
        int currentSum = 0, count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum == targetSum) {
                count++;
                currentSum = 0;
            }
            if (count == 2 && i < arr.length - 1) {
                return true;
            }
        }
        
        return false;
    }
}
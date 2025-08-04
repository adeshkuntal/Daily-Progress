// Last updated: 8/4/2025, 6:59:03 PM
class Solution {
    public int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // Return an empty array if no solution is found
        return new int[] {};   
    }
}
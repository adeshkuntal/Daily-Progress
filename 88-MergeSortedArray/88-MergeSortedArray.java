// Last updated: 8/4/2025, 6:57:41 PM
class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        int i = n - 1;  // Last valid element in arr1
        int j = m - 1;  // Last element in arr2
        int k = n + m - 1; // Last index of arr1 after merging

        // Merge from the end to avoid overwriting arr1's values
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        // If arr2 still has elements left, copy them (arr1's elements are already in place)
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
    }
}

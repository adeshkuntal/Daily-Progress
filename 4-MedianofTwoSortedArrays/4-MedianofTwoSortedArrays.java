// Last updated: 9/27/2025, 3:25:22 PM
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[index++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[index++] = arr2[i];
        }

        Arrays.sort(mergedArray);

        int n = mergedArray.length;
        if (n % 2 != 0) {
            return mergedArray[n / 2];
        } else {
            return (mergedArray[(n / 2) - 1] + mergedArray[n / 2]) / 2.0;
        }
    }
}
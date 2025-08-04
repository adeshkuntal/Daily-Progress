// Last updated: 8/4/2025, 6:58:42 PM
class Solution {
    public int threeSumClosest(int[] arr, int t) {
        Arrays.sort(arr);
        int current = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int r = arr[i] + arr[j] + arr[k];
                    if (Math.abs(r - t) < Math.abs(current - t)) {
                        current = r;
                    }
                }
            }
        }
        return current;
    }
}
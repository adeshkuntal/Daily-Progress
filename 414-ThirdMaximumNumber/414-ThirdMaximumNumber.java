// Last updated: 8/4/2025, 6:55:32 PM
class Solution {
    public int thirdMax(int[] arr) {
        int n = arr.length;
        StringBuilder s = new StringBuilder();
        Arrays.sort(arr);

        if (arr.length <= 2) {
            return arr[arr.length - 1];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                s.append(arr[i]).append(" ");
            }
        }
        String[] uniqueStrs = s.toString().trim().split(" ");
        if (uniqueStrs.length < 3) {
            return Integer.parseInt(uniqueStrs[uniqueStrs.length - 1]);
        }

        return Integer.parseInt(uniqueStrs[uniqueStrs.length - 3]);
    }
}
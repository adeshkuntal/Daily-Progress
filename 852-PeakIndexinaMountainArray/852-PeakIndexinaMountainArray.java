// Last updated: 2/2/2026, 7:47:59 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int left = 1;
4        int right = arr.length - 2;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
10                return mid;
11            } else if (arr[mid] < arr[mid + 1]) {
12                left = mid + 1;
13            } else {
14                right = mid - 1;
15            }
16        }
17
18        return -1;
19    }
20}
21
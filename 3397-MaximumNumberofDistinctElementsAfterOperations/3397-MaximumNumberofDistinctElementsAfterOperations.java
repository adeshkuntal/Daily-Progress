// Last updated: 10/18/2025, 12:46:30 PM
class Solution {
    public int maxDistinctElements(int[] arr, int diff) {
        if (arr.length == 0){
            return 0;
        }
        Arrays.sort(arr);
        int count = 0;
        int prev = Integer.MIN_VALUE >> 1;

        for (int i = 0, n = arr.length; i < n; i++) {
            int a = arr[i];
            int low = a - diff;
            int high = a + diff;
            int x = prev + 1;
            if (x < low){
                x = low;
            }
            if (x <= high) {
                count++;
                prev = x;
            }
        }
        return count;
    }
}

// class Solution {
//     public int maxDistinctElements(int[] nums, int k) {
//         Set<Integer> set = new HashSet<>();
//         int count = 0;

//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length; i++) {
//             int x = nums[i];
//             for (int j = -k; j <= k; j++) {
//                 int val = x + j;
//                 if (!set.contains(val)) {
//                     set.add(val);
//                     count++;
//                     break;
//                 }
//             }
//         }

//         return count;
//     }
// }

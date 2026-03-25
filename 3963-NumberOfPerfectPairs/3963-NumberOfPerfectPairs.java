// Last updated: 3/25/2026, 10:02:04 PM
// class Solution {
//     public long perfectPairs(int[] nums) {
//         Arrays.sort(nums);
//         long count = 0;
//         int n = nums.length;

//         for(int i = 0; i < n; i++){
//             int j = i + 1;
//             while(j < n){
//                 int a = nums[i];
//                 int b = nums[j];

//                 int min1 = Math.min(Math.abs(a - b), Math.abs(a + b));
//                 int min2 = Math.min(Math.abs(a), Math.abs(b));

//                 if(min1 <= min2){
//                     count++;
//                 }
//                 j++;
//             }
//         }
//         return count;
//     }
// }



class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long count = 0;

        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = Math.abs((long) nums[i]);
        }

        Arrays.sort(arr);

        int j = 0;
        for(int i = 0; i < n; i++){
            if(j < i) j = i;
            while(j + 1 < n && arr[j + 1] <= 2 * arr[i]){
                j++;
            }
            count += (j - i);
        }

        return count;
    }
}

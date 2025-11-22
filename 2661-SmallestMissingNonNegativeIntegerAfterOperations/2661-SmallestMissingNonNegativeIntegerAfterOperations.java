// Last updated: 11/22/2025, 1:17:35 PM
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        int res = 0;
        int[] rem = new int[value];
        for (int x : nums) {
            int r = ((x % value) + value) % value;
            rem[r]++;
        }
        while (rem[res % value]-- > 0)
            res++;
        return res;
    }
}



// class Solution {
//     public int findSmallestInteger(int[] nums, int value) {
//         Set<Integer> set = new HashSet<>();
//         for (int i = 0; i < nums.length; i++) {
//             int mod = ((nums[i] % value) + value) % value;
//             set.add(mod);
//         }

//         int mex = 0;
//         while (true) {
//             int mod = mex % value;
//             if (!set.contains(mod)) {
//                 return mex;
//             }
//             mex++;
//         }
//     }
// }

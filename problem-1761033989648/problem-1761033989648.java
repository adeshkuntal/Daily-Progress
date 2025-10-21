// Last updated: 10/21/2025, 1:36:29 PM
class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Map<Integer,Integer> mp = new HashMap<>();
        for (int num : nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        List<Integer> keys = new ArrayList<>(mp.keySet());
        Collections.sort(keys);
        int freq=0;
        int ans=0;
        int i=0;
        int j=0;
        for (int center = keys.get(0); center <= keys.get(keys.size()-1); center++) {
            while (j < keys.size() && keys.get(j) <= center+k){
                freq += mp.get(keys.get(j++));
            }
            while (i < keys.size() && keys.get(i) < center-k){
                freq -= mp.get(keys.get(i++));
            }
            ans = Math.max(ans, Math.min(mp.getOrDefault(center,0)+numOperations, freq));
        }
        return ans;
    }
}







// class Solution {
//     public int maxFrequency(int[] nums, int k, int numOperations) {
//         int n = nums.length;
//         boolean[] used = new boolean[nums.length];
        
//         while (numOperations > 0) {
//             for (int i = 0; i < n; i++) {
//                 if (!used[i]) {
//                     nums[i] = nums[i] + k;
//                     used[i] = true;
//                     numOperations--;
//                     if (numOperations == 0){
//                         break;
//                     }
//                 }
//             }
//         }

//         int maxFreq = 0;
//         for (int i = 0; i < n; i++) {
//             int freq = 0;
//             for (int j = 0; j < n; j++) {
//                 if (nums[i] == nums[j]){
//                     freq++;
//                 }
//             }
//             if (freq > maxFreq){
//                 maxFreq = freq;
//             }
//         }

//         return  maxFreq;
//     }
// }

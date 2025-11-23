// Last updated: 11/23/2025, 8:40:43 AM
class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int n = nums.length;
        int xr = 0;
        int diff = 0;
        HashMap<String,Integer> map = new HashMap<>();
        map.put("0#0",-1);
        int ans = 0;

        for(int i=0; i<n; i++){
            xr ^= nums[i];
            if(nums[i] % 2 == 0){
                diff++;
            }
            else{
                diff--;
            }

            String k = xr + "#" + diff;
            if(map.containsKey(k)){
                int len = i - map.get(k);
                if(len > ans){
                    ans = len;
                }
            }
            else{
                map.put(k,i);
            }
        }

        return ans;
    }
}
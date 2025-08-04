// Last updated: 8/4/2025, 6:55:47 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int a = nums[0];
        
        List<List<Integer>> ll = new ArrayList<>();
        for(int i=1; i<nums.length; i++){
            if(a==nums[i]){
                count += 1;
            }
            else {
                ll.add(Arrays.asList(a, count));
                a = nums[i];
                count = 1;
            }
        }
        ll.add(Arrays.asList(a, count));
        ll.sort((x, y) -> Integer.compare(y.get(1), x.get(1)));

        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = ll.get(i).get(0);
        }
        return ans;
    }
}
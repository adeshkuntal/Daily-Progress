// Last updated: 8/4/2025, 6:52:45 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        List<Integer> com = new ArrayList<>();
        com.addAll(even);
        com.addAll(odd);
        int[] ans = new int[com.size()];
        for (int i = 0; i < com.size(); i++) {
            ans[i] = com.get(i);
        }
        return ans;
    }
}
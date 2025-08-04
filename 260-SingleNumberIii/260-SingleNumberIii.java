// Last updated: 8/4/2025, 6:56:20 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        int a = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (a == nums[i]) {
                count += 1;
            } else {
                if (count == 1) {
                    l.add(a);
                }
                a = nums[i];
                count = 1;
            }
        }
        if (count == 1) {
            l.add(a);
        }

        int[] result = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }

        return result;
    }
}
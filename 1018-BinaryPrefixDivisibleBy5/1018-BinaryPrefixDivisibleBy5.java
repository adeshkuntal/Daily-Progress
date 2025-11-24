// Last updated: 11/24/2025, 8:56:05 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int curr = 0;

        for (int num : nums) {
            curr = (curr * 2 + num) % 5;
            result.add(curr == 0);
        }

        return result;
    }
}
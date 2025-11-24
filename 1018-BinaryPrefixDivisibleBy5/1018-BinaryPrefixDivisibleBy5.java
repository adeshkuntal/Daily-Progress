// Last updated: 11/24/2025, 8:55:40 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int currentNumber = 0;

        for (int num : nums) {
            currentNumber = (currentNumber * 2 + num) % 5;
            result.add(currentNumber == 0);
        }

        return result;
    }
}
// Last updated: 8/4/2025, 7:04:32 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0, start = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int end = 0; end < fruits.length; end++) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            while (map.size() > 2) {
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if (map.get(fruits[start]) == 0) {
                    map.remove(fruits[start]);
                }
                start++;
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}

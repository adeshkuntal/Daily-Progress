// Last updated: 8/4/2025, 6:53:28 PM
class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        for (char ch : order.toCharArray()) {
            while (count[ch - 'a'] > 0) {
                result.append(ch);
                count[ch - 'a']--;
            }
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            while (count[ch - 'a'] > 0) {
                result.append(ch);
                count[ch - 'a']--;
            }
        }

        return result.toString();
    }
}
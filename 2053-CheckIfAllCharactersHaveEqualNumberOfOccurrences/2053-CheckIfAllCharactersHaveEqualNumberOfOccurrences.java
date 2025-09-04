// Last updated: 9/4/2025, 7:16:16 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count = 0;
        int ans = 0;
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (a == s.charAt(j)) {
                    count++;
                }
            }
            if (ans == 0) {
                ans = count;
            } else if (count != ans) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}

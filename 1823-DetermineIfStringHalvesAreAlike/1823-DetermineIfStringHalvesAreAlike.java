// Last updated: 8/4/2025, 6:50:10 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2, s.length());
        int vowel_a = 0;
        int vowel_b = 0;
        for (int i = 0; i < a.length(); i++) {
            if (isVowel(a.charAt(i))) {
                vowel_a += 1;
            }
            if (isVowel(b.charAt(i))) {
                vowel_b += 1;
            }
        }
        if (vowel_a != vowel_b) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
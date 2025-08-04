// Last updated: 8/4/2025, 6:54:33 PM
class Solution {
    public String reverseWords(String s) {
        StringBuilder new_s = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                new_s.append(word.charAt(j));
            }
            if (i < words.length - 1) {
                new_s.append(" ");
            }
        }

        return new_s.toString();
    }
}
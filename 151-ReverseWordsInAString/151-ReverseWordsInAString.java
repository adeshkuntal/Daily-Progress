// Last updated: 8/4/2025, 6:57:08 PM
class Solution {
    public String reverseWords(String s) {
        // Remove leading and trailing spaces
        s = s.trim();
        // Split the string by one or more spaces
        String[] s1 = s.split("\\s+");
        // Return the reversed words
        return reverse_words(s1);
    }

    public static String reverse_words(String[] s) {
        int i = s.length - 1;
        StringBuilder s1 = new StringBuilder();
        while (i >= 0) {
            s1.append(s[i]).append(" ");
            i--;
        }
        // Convert StringBuilder to String and trim any trailing space
        return s1.toString().trim();
    }
}

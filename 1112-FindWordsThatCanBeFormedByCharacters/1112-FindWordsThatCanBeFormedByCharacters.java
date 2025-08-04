// Last updated: 8/4/2025, 6:52:10 PM
class Solution {
    public int countCharacters(String[] words, String chars) {
        int totalLength = 0;
        int[] charCount = new int[26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (String word : words) {
            if (canBeFormed(word, charCount)) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }

    private static boolean canBeFormed(String word, int[] charCount) {
        int[] tempCount = Arrays.copyOf(charCount, charCount.length);

        for (char c : word.toCharArray()) {
            if (tempCount[c - 'a'] <= 0) {
                return false;
            }
            tempCount[c - 'a']--;
        }

        return true;
    }
}
// Last updated: 8/4/2025, 6:54:50 PM
class Solution {
    public boolean detectCapitalUse(String word) {
      int n = word.length();

        // Check if all letters are capitals
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Check if all letters are not capitals
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Check if only the first letter is capital
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        return false; 
    }
}
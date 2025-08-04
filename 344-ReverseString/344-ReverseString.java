// Last updated: 8/4/2025, 6:55:50 PM
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move towards the middle
            left++;
            right--;
        }
    }
}
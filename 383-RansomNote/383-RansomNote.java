// Last updated: 8/4/2025, 6:55:39 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineCounts = new int[26];
        
        // Count occurrences of each character in the magazine
        for (char c : magazine.toCharArray()) {
            magazineCounts[c - 'a']++;
        }
        
        // Check if the ransom note can be constructed from the magazine
        for (char c : ransomNote.toCharArray()) {
            if (magazineCounts[c - 'a'] == 0) {
                return false;
            }
            magazineCounts[c - 'a']--;
        }
        
        return true;
    }
}
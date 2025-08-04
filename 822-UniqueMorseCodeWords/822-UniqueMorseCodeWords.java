// Last updated: 8/4/2025, 6:53:20 PM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                               ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                               ".--", "-..-", "-.--", "--.."};
        
        Set<String> uniqueTransformations = new HashSet<>();
        
        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char c : word.toCharArray()) {
                morse.append(morseCodes[c - 'a']);
            }
            uniqueTransformations.add(morse.toString());
        }
        
        return uniqueTransformations.size();
    }
}
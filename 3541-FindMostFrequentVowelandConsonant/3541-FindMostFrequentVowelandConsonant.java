// Last updated: 9/13/2025, 12:03:41 PM
class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int vowel = 0;
        int cons = 0;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if(isVowel(ch)){
                vowel = Math.max(vowel,map.get(ch));
            }
            else{
                cons = Math.max(cons,map.get(ch));
            }
        }

        return vowel+cons;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
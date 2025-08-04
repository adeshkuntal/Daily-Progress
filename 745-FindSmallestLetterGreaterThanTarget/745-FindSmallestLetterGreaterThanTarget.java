// Last updated: 8/4/2025, 6:53:43 PM
class Solution {
    public char nextGreatestLetter(char[] ch, char target) {
        int a = (int) target;
        int r = Integer.MAX_VALUE; 
        char result = ch[0]; 

        for (int i = 0; i < ch.length; i++) {
            if ((int) ch[i] > a && (int) ch[i] < r) {
                r = (int) ch[i];
                result = ch[i];
            }
        }
        return result;
    }
}
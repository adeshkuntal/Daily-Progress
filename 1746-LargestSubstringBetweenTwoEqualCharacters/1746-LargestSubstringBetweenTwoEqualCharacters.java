// Last updated: 8/4/2025, 6:50:29 PM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int start = 0;
        int end = -1;
        int maxLen = -1;
        char a = s.charAt(0);
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == a){
                end = i;
                maxLen = Math.max(maxLen, end - start - 1);
            } else {
                if (s.indexOf(s.charAt(i)) != i) {
                    start = s.indexOf(s.charAt(i));
                    a = s.charAt(i);
                    end = i;
                    maxLen = Math.max(maxLen, end - start - 1);
                }
            }
        }
        if(maxLen != -1){
            return maxLen;
        } else {
            return -1;
        }
    }
}
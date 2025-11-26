// Last updated: 11/26/2025, 11:31:27 AM
class Solution {
    public int countGoodSubstrings(String s) {
        int k = 3;
        int count = 0;
        for(int i=0; i <= s.length() - k; i++){
            String str = s.substring(i, i + k);
            if(isGood(str)){
                count++;
            }
        }
        return count;
    }
    public static boolean isGood(String str){
        return str.charAt(0) != str.charAt(1) &&
               str.charAt(1) != str.charAt(2) &&
               str.charAt(0) != str.charAt(2);
    }
}

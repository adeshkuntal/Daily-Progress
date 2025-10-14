// Last updated: 10/14/2025, 9:55:39 PM
class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        String str = "";
        while (i<sb.length() - 1) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            if (Character.toLowerCase(c1) == Character.toLowerCase(c2) && c1 != c2) {
                sb.delete(i,i+2);
                if(i>0){
                    i--;
                }
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}


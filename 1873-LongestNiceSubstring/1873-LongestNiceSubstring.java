// Last updated: 8/4/2025, 6:50:00 PM
class Solution {
    public String longestNiceSubstring(String str) {
        String ans = "";
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String s = str.substring(i, j);
                boolean l = true;
                
                for (int k = 0; k < s.length(); k++) {
                    char ch = s.charAt(k);
                    if (Character.isLowerCase(ch)) {
                        if (!s.contains(Character.toString(Character.toUpperCase(ch)))) {
                            l = false;
                            break;
                        }
                    } else {
                        if (!s.contains(Character.toString(Character.toLowerCase(ch)))) {
                            l = false;
                            break;
                        }
                    }
                }
                
                if (l && s.length() > ans.length()) {
                    ans = s;
                }
            }
        }

        return ans;


    }
}
// Last updated: 9/30/2025, 9:06:12 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        for(int i=0; i<s.length(); i++){
            Set<Character> set = new HashSet<>();
            for(int j=i; j<s.length(); j++){
                char c = s.charAt(j);
                if(set.contains(c)){
                    break;
                }

                set.add(c);
                count = Math.max(count,set.size());
            }
        }

        return count;
    }
}
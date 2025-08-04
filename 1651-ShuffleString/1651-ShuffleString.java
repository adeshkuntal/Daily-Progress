// Last updated: 8/4/2025, 6:50:47 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ansArr = new char[indices.length];
        for(int i=0; i< indices.length; i++){
            ansArr[indices[i]] = s.charAt(i);
        }
        String ans = new String(ansArr);
        return ans;
    }
}
// Last updated: 8/4/2025, 6:50:23 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a1 = "";
        String a2 = "";
        for(String x : word1){
            a1+=x;
        }
        for(String x : word2){
            a2+=x;
        }
        
        return a1.equals(a2);
    }
}
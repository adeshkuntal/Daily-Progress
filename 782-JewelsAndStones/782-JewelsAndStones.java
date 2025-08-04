// Last updated: 8/4/2025, 6:53:33 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<jewels.length(); i++){
            char a = jewels.charAt(i);
            for(int j=0; j<stones.length(); j++){
                if(stones.charAt(j)==a){
                    count+=1;
                }
            }
        }
        return count;
    }
}
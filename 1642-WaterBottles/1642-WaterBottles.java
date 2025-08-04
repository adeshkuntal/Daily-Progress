// Last updated: 8/4/2025, 6:50:50 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>=numExchange){
            int z = numBottles/numExchange;
            ans+=z;
            numBottles = (numBottles-(numExchange*z)) + z;
        }

        return ans;
    }
}
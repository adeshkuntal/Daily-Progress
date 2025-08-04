// Last updated: 8/4/2025, 6:51:15 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        for(int i=0; i<candies.length; i++){
            int a = candies[i] + extraCandies;
            boolean temp = true;
            for(int j=0; j<candies.length; j++){
                if(a < candies[j]){
                    temp = false;
                    break;
                }
            }
            result.add(temp);
        }

        return result;
    }
}
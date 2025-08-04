// Last updated: 8/4/2025, 6:58:17 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int amount) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        combination(coin,amount,l,0,ans);
        return ans;
    }
    public static void combination(int[] coin,int amount,List<Integer> l,int idx,List<List<Integer>> ans){
        if(amount==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx; i< coin.length; i++){
            if(amount>=coin[i]){
                l.add(coin[i]);
                combination(coin,amount-coin[i],l,i,ans);
                l.remove(l.size()-1);
            }
        }
    }
}
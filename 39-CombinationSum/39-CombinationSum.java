// Last updated: 10/11/2025, 9:17:40 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] coin, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        combination(coin,target,l,0,ans);
        return ans;
    }
    public static void combination(int[] coin,int target,List<Integer> l,int idx,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=idx; i< coin.length; i++){
            if(target>=coin[i]){
                l.add(coin[i]);
                combination(coin,target-coin[i],l,i,ans);
                l.remove(l.size()-1);
            }
        }
    }
}
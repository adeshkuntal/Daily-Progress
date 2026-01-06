// Last updated: 1/6/2026, 3:39:52 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] coin, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> l= new ArrayList<>();
5        combination(coin,target,l,0,ans);
6        return ans;
7    }
8    public static void combination(int[] coin,int target,List<Integer> l,int idx,List<List<Integer>> ans){
9        if(target==0){
10            ans.add(new ArrayList<>(l));
11            return;
12        }
13        for(int i=idx; i< coin.length; i++){
14            if(target>=coin[i]){
15                l.add(coin[i]);
16                combination(coin,target-coin[i],l,i,ans); //if we have given we can use a coin one time then we use (i+1) in this but we can use any coin infinitely that is why we use i there 
17                l.remove(l.size()-1);
18            }
19        }
20    }
21}
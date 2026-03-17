// Last updated: 3/17/2026, 6:48:57 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] c, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        fn(res,new ArrayList<>(),c,target,0,0);
5        return res;
6    }
7    public void fn(List<List<Integer>> res,ArrayList<Integer> temp,int[] c,int target,int idx,int sum){
8        if(target == sum){
9            res.add(new ArrayList<>(temp));
10            return;
11        }
12        if(sum > target) return;
13        for(int i=idx; i<c.length; i++){
14            temp.add(c[i]);
15            fn(res,temp,c,target,i,sum+c[i]);
16            temp.remove(temp.size()-1);
17        }
18    }
19}
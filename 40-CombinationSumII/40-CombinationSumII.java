// Last updated: 3/17/2026, 7:04:32 PM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] c, int target) {
3        List<List<Integer>> res = new ArrayList<>();
4        Arrays.sort(c);
5        fn(res, new ArrayList<>(), c, target, 0);
6        return res;
7    }
8
9    public void fn(List<List<Integer>> res, ArrayList<Integer> temp, int[] c, int target, int idx){
10        if(target == 0){
11            res.add(new ArrayList<>(temp));
12            return;
13        }
14
15        for(int i = idx; i < c.length; i++){
16            if(i > idx && c[i] == c[i-1]) continue;
17
18            if(c[i] > target) break;
19
20            temp.add(c[i]);
21            fn(res, temp, c, target - c[i], i + 1);
22            temp.remove(temp.size() - 1);
23        }
24    }
25}
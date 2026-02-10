// Last updated: 2/10/2026, 9:13:25 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        findSubset(nums, res, new ArrayList<>(), 0);
5        return res;
6    }
7    public static void findSubset(int[] nums, List<List<Integer>> res, List<Integer> l, int idx) {
8        if(idx == nums.length){
9            res.add(new ArrayList<>(l));
10            return;
11        }
12        l.add(nums[idx]);
13        findSubset(nums,res,l,idx+1);
14        l.remove(l.size()-1);
15        findSubset(nums,res,l,idx+1);
16    }
17}
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
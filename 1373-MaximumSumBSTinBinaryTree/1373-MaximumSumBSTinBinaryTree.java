// Last updated: 3/11/2026, 11:52:36 AM
1/**
2* Definition for a binary tree node.
3* public class TreeNode {
4*     int val;
5*     TreeNode left;
6*     TreeNode right;
7*     TreeNode() {}
8*     TreeNode(int val) { this.val = val; }
9*     TreeNode(int val, TreeNode left, TreeNode right) {
10*         this.val = val;
11*         this.left = left;
12*         this.right = right;
13*     }
14* }
15*/
16
17class Solution {
18    int ans = 0;
19    public int maxSumBST(TreeNode root) {
20        dfs(root);
21        return ans;
22    }
23
24    // Returns: [maxValue, minValue, sumOfSubtree]
25    private int[] dfs(TreeNode root) {
26        if(root == null){
27            return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,0};
28        }
29        int[] left = dfs(root.left);
30        int[] right = dfs(root.right);
31
32        if(root.val > left[0] && root.val<right[1]){
33            int curr = left[2]+right[2]+root.val;
34            ans = Math.max(ans,curr);
35
36            int minValue = Math.min(root.val,left[1]);
37            int maxValue = Math.max(root.val,right[0]);
38
39            return new int[]{maxValue,minValue,curr};
40        }
41
42        return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
43    }
44}
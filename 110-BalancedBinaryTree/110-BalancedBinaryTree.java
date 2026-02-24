// Last updated: 2/24/2026, 12:01:55 PM
1class Solution {
2    int max = Integer.MIN_VALUE;
3    public int maxPathSum(TreeNode root) {
4        solve(root);
5        return max;
6    }
7    private int solve(TreeNode root){
8        if(root == null){
9            return 0;
10        }
11        int left = Math.max(0, solve(root.left));
12        int right = Math.max(0, solve(root.right));
13        max = Math.max(max, left + right + root.val);
14        return root.val + Math.max(left, right);
15    }
16}
// Last updated: 2/10/2026, 2:25:16 PM
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
18    int ans;
19    public int maxSumBST(TreeNode root) {
20        ans = 0;
21        dfs(root);
22        return ans;
23    }
24
25    // Returns: [minValue, maxValue, sumOfSubtree]
26    private int[] dfs(TreeNode root) {
27        if (root == null) {
28            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
29        }
30
31        int[] leftSubtree = dfs(root.left);
32        int[] rightSubtree = dfs(root.right);
33
34        // Check BST validity
35        if (root.val > leftSubtree[1] && root.val < rightSubtree[0]) {
36            int currSum = leftSubtree[2] + rightSubtree[2] + root.val;
37            ans = Math.max(ans, currSum);
38
39            int minValue = Math.min(root.val, leftSubtree[0]);
40            int maxValue = Math.max(root.val, rightSubtree[1]);
41
42            return new int[]{minValue, maxValue, currSum};
43        }
44
45        // Mark subtree as invalid BST
46        return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
47    }
48}
// Last updated: 3/27/2026, 3:41:00 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16
17class Solution {
18    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
19        if(root1 == null) return root2;
20        if(root2 == null) return root1;
21
22        root1.val = root1.val + root2.val;
23
24        root1.left = mergeTrees(root1.left, root2.left);
25        root1.right = mergeTrees(root1.right, root2.right);
26
27        return root1;
28    }
29}
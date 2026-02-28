// Last updated: 2/28/2026, 2:08:11 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if (root == null){
13            return null;
14        }
15        if (root == p || root == q){
16            return root;
17        }
18
19        TreeNode left = lowestCommonAncestor(root.left, p, q);
20        TreeNode right = lowestCommonAncestor(root.right, p, q);
21
22        if (left != null && right != null){
23            return root;
24        }
25        return left == null ? right : left;
26    }
27}
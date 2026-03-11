// Last updated: 3/11/2026, 12:32:40 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if (root == null){
14            return null;
15        }
16        if (root == p || root == q){
17            return root;
18        }
19
20        TreeNode left = lowestCommonAncestor(root.left, p, q);
21        TreeNode right = lowestCommonAncestor(root.right, p, q);
22
23        if (left != null && right != null){
24            return root;
25        }
26        return left == null ? right : left;
27    }
28}
// Last updated: 3/3/2026, 10:56:16 AM
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
16class Solution {
17    public boolean isValidBST(TreeNode root) {
18        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
19    }
20
21    public boolean check(TreeNode node, long min, long max) {
22        if(node == null) {
23            return true;
24        }
25
26        if(node.val <= min || node.val >= max) {
27            return false;
28        }
29
30        return check(node.left, min, node.val) && check(node.right, node.val, max);
31    }
32}
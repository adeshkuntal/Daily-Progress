// Last updated: 3/10/2026, 10:03:23 PM
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
17    TreeNode prev = null;
18    TreeNode first = null;
19    TreeNode second = null;
20    public void recoverTree(TreeNode root) {
21        inorder(root);
22        int temp = first.val;
23        first.val = second.val;
24        second.val = temp;
25
26    }
27    public void inorder(TreeNode root){
28        if(root == null){
29            return;
30        }
31        inorder(root.left);
32        if(prev != null && root.val < prev.val){
33            if(first == null){
34                first = prev;
35            }
36            second = root;
37        }
38
39        prev = root;
40
41        inorder(root.right);
42    }
43}
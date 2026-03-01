// Last updated: 3/1/2026, 9:56:39 PM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> res = new ArrayList<>();
19        inorder(root,res);
20        return res;
21    }
22    public static void inorder(TreeNode root,List<Integer> res){
23        if(root == null){
24            return;
25        }
26        inorder(root.left,res);
27        res.add(root.val);
28        inorder(root.right,res);
29    }
30
31}
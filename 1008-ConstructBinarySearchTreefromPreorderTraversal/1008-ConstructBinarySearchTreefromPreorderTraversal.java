// Last updated: 3/11/2026, 12:16:11 PM
1class Solution {
2    public TreeNode bstFromPreorder(int[] preorder) {
3        TreeNode root = null;
4
5        for(int i = 0; i < preorder.length; i++){
6            root = contruct(root, preorder[i]);
7        }
8
9        return root;
10    }
11
12    public TreeNode contruct(TreeNode root, int val){
13        if(root == null){
14            return new TreeNode(val);
15        }
16
17        if(val < root.val){
18            root.left = contruct(root.left, val);
19        } 
20        else{
21            root.right = contruct(root.right, val);
22        }
23
24        return root;
25    }
26}
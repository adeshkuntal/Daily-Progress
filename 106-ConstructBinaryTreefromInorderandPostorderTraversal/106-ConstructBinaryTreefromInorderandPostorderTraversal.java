// Last updated: 3/1/2026, 2:10:14 PM
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
17    int postIndex;
18    Map<Integer, Integer> map = new HashMap<>();
19    public TreeNode buildTree(int[] inorder, int[] postorder) {
20        postIndex = postorder.length - 1;
21        for(int i = 0; i < inorder.length; i++) {
22            map.put(inorder[i], i);
23        }
24        return build(postorder, 0, inorder.length - 1);
25    }
26    public TreeNode build(int[] postorder, int left, int right){
27        if(left > right) return null;
28        
29        int val = postorder[postIndex--];
30        TreeNode root = new TreeNode(val);
31        
32        int index = map.get(val);
33        
34        root.right = build(postorder, index + 1, right);
35        root.left = build(postorder, left, index - 1);
36        
37        return root;
38    }
39}